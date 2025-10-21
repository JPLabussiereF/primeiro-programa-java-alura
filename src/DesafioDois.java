public class DesafioDois {

    public static void main(String[] args) {

        // Crie um programa que realize a média de duas notas decimais e exiba o resultado.
        double note1 = 5.7;
        double note2 = 9.4;
        double averageNote = (note1 + note2) / 2;
        System.out.println("A média é: " + averageNote);

        // Declare uma variável do tipo double e uma variável do tipo int. Faça o casting da variável double para int e imprima o resultado.
        double variable = 4.5;
        int variableInt = (int) variable;
        System.out.println("A variável double com casting para int é: " + variableInt);

        // Declare uma variável do tipo char (letra) e uma variável do tipo String (palavra). Atribua valores a essas variáveis e concatene-as em uma mensagem.
        char letter = 'B';
        String word = "runo";
        System.out.println(letter + word);

        // Declare uma variável do tipo double precoProduto e uma variável do tipo int (quantidade). Calcule o valor total multiplicando o preço do produto pela quantidade e apresente o resultado em uma mensagem.
        double productPrice = 800.0;
        int productAmount = 3;
        int totalValue = (int) (productAmount * productPrice);
        System.out.println("O preço total do produto vezes sua quantidade disponível é: " + totalValue);

        // Declare uma variável do tipo double valorEmDolares. Atribua um valor em dólares a essa variável. Considere que o valor de 1 dólar é equivalente a 4.94 reais. Realize a conversão do valor
        // em dólares para reais e imprima o resultado formatado.
        double valueInDollars = 300;
        double valueInReal = valueInDollars * 4.94;
        System.out.printf("O valor em dólares é: %.2f\n", valueInDollars);
        System.out.printf("O valor em real é: %.2f\n", valueInReal);

        // Declare uma variável do tipo double precoOriginal. Atribua um valor em reais a essa variável, representando o preço original de um produto.
        // Em seguida, declare uma variável do tipo double percentualDesconto e atribua um valor percentual de desconto ao produto (por exemplo, 10 para 10%).
        // Calcule o valor do desconto em reais, aplique-o ao preço original e imprima o novo preço com desconto.
        double originalPrice = 300;
        double percentageDiscount = 10;
        double discountedValue = originalPrice - (originalPrice * (percentageDiscount / 100));
        System.out.println("O valor '" + originalPrice + "' com desconto é: " + discountedValue);

    }
}
