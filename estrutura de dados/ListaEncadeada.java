class main {
    public static void main(String[] args) {
        ListaEncadeada lista = new ListaEncadeada();

        // removendo da lista vazia
        System.out.println("tentando remover sem lista");
        lista.remover(0);

        /* adicionando no final */
        lista.adicionarNoFinal(1);
        lista.adicionarNoFinal(2);
        lista.adicionarNoFinal(10);

        // adicionando no meio
        lista.adicionarNoMeio(5);
        lista.adicionarNoMeio(6);
        lista.adicionarNoMeio(3);
        lista.adicionarNoMeio(-20);
        lista.adicionarNoMeio(-15);
        lista.adicionarNoMeio(4);

        // lista completa
        System.out.println("\nlista completa");
        Node atual = lista.getHead();
        while (atual != null) {
            System.out.print(atual.getDados() + " ");
            atual = atual.getProximo();
        }
        System.out.println();

        // remover
        lista.remover(0);
        lista.remover(6);
        lista.remover(3);
        lista.remover(4);
        lista.remover(10);
        lista.remover(-20);

        // lista depois da remocao
        atual = lista.getHead();
        while (atual != null) {
            System.out.print(atual.getDados() + " ");
            atual = atual.getProximo();
        }

        lista.adicionarNoMeio(5);
        lista.adicionarNoMeio(5);
        lista.adicionarNoMeio(2);
        lista.adicionarNoMeio(2);
        lista.adicionarNoMeio(3);
        lista.adicionarNoMeio(3);
        lista.adicionarNoMeio(5);
        lista.adicionarNoMeio(5);

        System.out.println("\n\ninserindo valores repetidos");
        atual = lista.getHead();
        while (atual != null) {
            System.out.print(atual.getDados() + " ");
            atual = atual.getProximo();
        }

        lista.removerRepetidos();

        atual = lista.getHead();
        while (atual != null) {
            System.out.print(atual.getDados() + " ");
            atual = atual.getProximo();
        }

        lista.adicionarNoMeio(1);
        lista.adicionarNoMeio(1);
        lista.adicionarNoMeio(1);
        lista.adicionarNoMeio(5);
        lista.adicionarNoMeio(5);

        System.out.println("\n\ninserindo valores para serem completamente removidos");
        atual = lista.getHead();
        while (atual != null) {
            System.out.print(atual.getDados() + " ");
            atual = atual.getProximo();
        }

        lista.removerTodosRepetidos();

        atual = lista.getHead();
        while (atual != null) {
            System.out.print(atual.getDados() + " ");
            atual = atual.getProximo();
        }

        lista.inverterLista();

        atual = lista.getHead();
        while (atual != null) {
            System.out.print(atual.getDados() + " ");
            atual = atual.getProximo();
        }
    }
}

class ListaEncadeada {
    private int tamanho;
    private Node head;
    private Node tail;

    public ListaEncadeada() {
        this.tamanho = 0;
        this.head = null;
        this.tail = null;
    }

    public void adicionarNoFinal(int valor) {
        Node novoNo = new Node(valor);

        if (head == null) {
            this.head = novoNo;
            this.tail = novoNo;
        } else {
            this.tail.setProximo(novoNo);
            this.tail = novoNo;
        }

        this.tamanho++;
    }

    public void adicionarNoMeio(int valor) {
        Node novNode = new Node(valor);

        if (head == null) {
            this.head = novNode;
            this.tamanho++;
            return;
        }

        // se a cabeca for menor que o valor (numero negativo)
        if (valor < head.getDados()) {
            novNode.setProximo(head);
            this.head = novNode;
            this.tamanho++;
            return;
        }

        Node atual = this.head;
        while (atual.getProximo() != null && atual.getProximo().getDados() < valor) {
            atual = atual.getProximo();
        }

        novNode.setProximo(atual.getProximo());
        atual.setProximo(novNode);
        this.tamanho++;
    }

    public void remover(int valor) {
        System.out.println("\n" + "numero para remover: " + valor);

        if (head == null) {
            System.out.println("\n" + "lista vazia");
            return;
        }

        // se o head for o valor á excluir
        if (head.getDados() == valor) {
            head = head.getProximo();
            this.tamanho--;
            return;
        }

        Node atual = this.head;
        Node anterior = null;
        while (atual != null && atual.getDados() != valor) {
            anterior = atual;
            atual = atual.getProximo();
        }

        if (atual == null) {
            System.out.println("\n" + "numero nao encontrado: " + valor);
            return;
        }

        anterior.setProximo(atual.getProximo());
        atual.setProximo(null);
        this.tamanho--;
    }

    public void removerRepetidos() {
        System.out.println("\nremovendo valores repetidos");

        if (head == null) {
            System.out.println("\n" + "lista vazia");
            return;
        }

        Node atual = this.head;
        while (atual != null && atual.getProximo() != null) {

            if (atual.getDados() == atual.getProximo().getDados()) {
                atual.setProximo(atual.getProximo().getProximo());
            } else {
                atual = atual.getProximo();
            }
        }
    }

    public void removerTodosRepetidos() {
        System.out.println("\nremovendo todos os numeros que se repetem");

        if (head == null) {
            System.out.println("\n" + "lista vazia");
            return;
        }

        Node dummy = new Node(-999);
        dummy.setProximo(head);

        Node atual = head;
        Node anterior = dummy;

        while (atual != null && atual.getProximo() != null) {

            if (atual.getDados() == atual.getProximo().getDados()) {
                while (atual.getProximo() != null && atual.getDados() == atual.getProximo().getDados()) {
                    atual = atual.getProximo();
                }
                anterior.setProximo(atual.getProximo());
            } else {
                anterior = anterior.getProximo();
            }
            atual = atual.getProximo();
        }
        head = dummy.getProximo();
    }

    public Node getHead() {
        return head;
    }

    public void inverterLista(){
        System.out.println("\ninvertendo a lista encadeada");

        if (head == null) {
            System.out.println("\n" + "lista vazia");
            return;
        }

        Node atual = head;
        Node alto = null;
        Node baixo = null;

        while(atual != null){
            alto = atual.getProximo();

            atual.setProximo(baixo);

            baixo = atual;
            atual = alto;
        }
        this.head = baixo;
    }
}

class Node {
    private int dados;
    private Node proximo;

    public Node(int dados) {
        this.dados = dados;
    }

    public Node getProximo() {
        return proximo;
    }

    public void setProximo(Node proximo) {
        this.proximo = proximo;
    }

    public int getDados() {
        return dados;
    }

    public void setDados(int dados) {
        this.dados = dados;
    }
}
