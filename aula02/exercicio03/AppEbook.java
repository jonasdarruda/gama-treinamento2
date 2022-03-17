package exercicio03;

public class AppEbook {
    public static void main(String[] args) {
        Ebook livro = new Ebook("Progrcao com o Profº Emerson ", " Jonas Arruda ", 500);
        System.out.println(livro.mostrarDados());
        livro.avancarPagina();
        System.out.println(livro.getPaginaAtual());
        livro.voltarPagina();
        livro.voltarPagina();
        System.out.println(livro.getPaginaAtual());
        boolean alterou = livro.irParaPagina(200);
        if (alterou) {
            System.out.println("Foi para pagina");
        } else {
            System.out.println("Pagina invalida");
        }
    }
}
