public class ValidarCnpj {

    public static boolean validarCNPJ(String cnpj) {
        String cnpjFormatado = removerCaracteresCnpj(cnpj);

        if (cnpjFormatado.length() != 14) {
            return false;
        }

        int primeiroDigito;
        int soma = 0;
        int resultado = 0;
        for (int i = 0, j = 5; i < 12; i++, j--) {
            if (j == 1) {
                j = 9;
                soma += (cnpjFormatado.charAt(i) - 48) * j;
            } else {
                soma += (cnpjFormatado.charAt(i) - 48) * j;
            }
        }

        resultado = soma % 11;
        if (resultado < 2) {
            primeiroDigito = 0;
            if ((cnpjFormatado.charAt(12) - 48) != primeiroDigito) {
                return false;
            }
        } else {
            primeiroDigito = 11 - resultado;
            if ((cnpjFormatado.charAt(12) - 48) != primeiroDigito) {
                return false;
            }
        }

        // Etapa do Segundo Digito
        int segundoDigito;
        int soma2 = 0;
        int resultado2 = 0;
        for (int i = 0, j = 6; i <= 12; i++, j--) {
            if (j == 1) {
                j = 9;
                soma2 += (cnpjFormatado.charAt(i) - 48) * j;
            } else {
                soma2 += (cnpjFormatado.charAt(i) - 48) * j;
            }
        }

        resultado2 = soma2 % 11;

        if (resultado2 < 2) {
            segundoDigito = 0;
            if ((cnpjFormatado.charAt(13) - 48) != segundoDigito) {
                return false;
            }
        } else {
            segundoDigito = 11 - resultado2;
            if ((cnpjFormatado.charAt(13) - 48) != segundoDigito) {
                return false;
            }
        }
        return true;
    }

    public static String removerCaracteresCnpj(String entrada) {
        String formatada = entrada.replaceAll("[^0-9]", "");
        return formatada;
    }
}
