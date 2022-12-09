public class Heapsort {

  private static int tamanho;
  private static int[] vetor;

  public void heapsort(int[] array) {
    vetor = array;
    tamanho = vetor.length - 1;
    construirHeap();
    for (int i = tamanho; i > 0; i--) {
      trocar(0, tamanho);
      tamanho -= 1;
      heapMaximo(0);
    }
  }

  private void construirHeap() {
    int meio = (int) (tamanho / 2);
    for (int i = meio - 1; i >= 0; i--) {
      heapMaximo(i);
    }
  }

  private void trocar(int i, int j) {
    int auxiliar;

    auxiliar = vetor[i];
    vetor[i] = vetor[j];
    vetor[j] = auxiliar;
  }

  private void heapMaximo(int pai) {
    int maior = pai,
        esquerda = 2 * pai + 1,
        direita = 2 * pai + 2;

    if (esquerda <= tamanho && vetor[esquerda] > vetor[maior])
      maior = esquerda;

    if (direita <= tamanho && vetor[direita] > vetor[maior])
      maior = direita;

    if (maior != pai) {
      trocar(pai, maior);
      heapMaximo(maior);
    }
  }

}