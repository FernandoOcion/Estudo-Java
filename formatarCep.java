public class formatarCep {

    public static void main(String[] args) {

        try {

            String cepFormatado = formatarCep("12345678");
            System.out.println(cepFormatado);
        } catch (CepInvalidoException e) {
            System.out.println("São necessários 8 digitos para o CEP");
        }
    }

    static String formatarCep(String cep) throws CepInvalidoException {
        if (cep.length() != 8)
            throw new CepInvalidoException();

        // simulando um cep formatado
        return "25.272-220";
    }
}
