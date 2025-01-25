public class Alvo {

    private int tamanho;
    private int xPos;
    private int yPos;
    private int velocidadeHorizontal;
    private int velocidadeVertical;

    public Alvo(){
        this.tamanho = 40;
        this.xPos = 40;
        this.yPos = 50;
        this.velocidadeHorizontal = 2;
        this.velocidadeVertical = 1;
    }

    public int getTamanho(){
        return tamanho;
    }

    public int getTamanhoX(){
        return xPos+tamanho;
    }

    public int getTamanhoY(){
        return yPos+tamanho;
    }

    public int getxPos() {
        return xPos;
    }

    public int getyPos() {
        return yPos;
    }

    public int getVelocidadeHorizontal() {
        return velocidadeHorizontal;
    }

    public int getVelocidadeVertical() {
        return velocidadeVertical;
    }

    public void setxPos(int xPos) {
        this.xPos = xPos;
    }

    public void setyPos(int yPos) {
        this.yPos = yPos;
    }

    public void setVelocidadeHorizontal(int velocidadeHorizontal) {
        this.velocidadeHorizontal = velocidadeHorizontal;
    }

    public void setVelocidadeVertical(int velocidadeVertical) {
        this.velocidadeVertical = velocidadeVertical;
    }
    

}