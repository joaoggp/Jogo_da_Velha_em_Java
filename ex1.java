/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testefinal;

/**
 *
 * @author João Vitor
 */
public class ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        char jogoV[][] = new char[3][3];
        int x, i, z, escolha, jogador, vit, contador;
        z = 0;
        vit = 0;
        escolha = 0;
        jogador = 1;
        contador = 0;

        System.out.println("Mapa do Jogo da Velha");
        for (x = 0; x < 3; x++) {
            System.out.print("|");
            for (i = 0; i < 3; i++) {
                z++;
                System.out.print(z + " |");
            }
            System.out.println();
        }

        while (vit != 1) {
            contador++;
            if (contador == 6) {
                System.out.println("Empate");
                System.exit(0);
            }

            //Jogador 1
            if (jogador == 1) {
                jogador = 2;

                escolha = Input.readInt("Insira a posição que deseja jogar ");

                //Atribui as letras na matriz
                //Escolha 1
                if (escolha == 1) {
                    jogoV[0][0] = 'X';
                    System.out.println(jogoV[0][0]);
                }
                if (escolha == 2) {
                    jogoV[0][1] = 'X';
                    System.out.println(jogoV[0][1]);
                }
                if (escolha == 3) {
                    jogoV[0][2] = 'X';
                    System.out.println(jogoV[0][2]);
                }
                //Escolha linha 2
                if (escolha == 4) {
                    jogoV[1][0] = 'X';
                    System.out.println(jogoV[0][0]);
                }
                if (escolha == 5) {
                    jogoV[1][1] = 'X';
                    System.out.println(jogoV[0][1]);
                }
                if (escolha == 6) {
                    jogoV[1][2] = 'X';
                    System.out.println(jogoV[0][2]);
                }
                //Escolha linha 3
                if (escolha == 7) {
                    jogoV[2][0] = 'X';
                    System.out.println(jogoV[0][0]);
                }
                if (escolha == 8) {
                    jogoV[2][1] = 'X';
                    System.out.println(jogoV[0][1]);
                }
                if (escolha == 9) {
                    jogoV[2][2] = 'X';
                    System.out.println(jogoV[0][2]);
                }

                //Verifica a vitória na primeira linha
                if (jogoV[0][0] == 'X' & jogoV[0][1] == 'X' & jogoV[0][2] == 'X') {
                    vit = 1;
                    for (x = 0; x < 3; x++) {
                        System.out.print("|");
                        for (i = 0; i < 3; i++) {
                            System.out.print(jogoV[x][i] + " |");
                        }
                        System.out.println();
                    }
                    System.out.println("O jogador 1 venceu!");
                    System.exit(0);
                }
                //Verifica vitoria linha 2
                if (jogoV[1][0] == 'X' & jogoV[1][1] == 'X' & jogoV[1][2] == 'X') {
                    vit = 1;
                    for (x = 0; x < 3; x++) {
                        System.out.print("|");
                        for (i = 0; i < 3; i++) {
                            System.out.print(jogoV[x][i] + " |");
                        }
                        System.out.println();
                    }
                    System.out.println("O jogador 1 venceu!");
                    System.exit(0);
                }
                //Verificar vitoria linha 3
                if (jogoV[2][0] == 'X' & jogoV[2][1] == 'X' & jogoV[2][2] == 'X') {
                    vit = 1;
                    for (x = 0; x < 3; x++) {
                        System.out.print("|");
                        for (i = 0; i < 3; i++) {
                            System.out.print(jogoV[x][i] + " |");
                        }
                        System.out.println();
                    }
                    System.out.println("O jogador 1 venceu!");
                    System.exit(0);
                }
                //Verificar vitória horizontal 1
                if (jogoV[0][0] == 'X' & jogoV[1][0] == 'X' & jogoV[2][0] == 'X') {
                    vit = 1;
                    for (x = 0; x < 3; x++) {
                        System.out.print("|");
                        for (i = 0; i < 3; i++) {
                            System.out.print(jogoV[x][i] + " |");
                        }
                        System.out.println();
                    }
                    System.out.println("O jogador 1 venceu!");
                    System.exit(0);
                }
                //Horizontal 2
                if (jogoV[0][1] == 'X' & jogoV[1][1] == 'X' & jogoV[2][1] == 'X') {
                    vit = 1;
                    for (x = 0; x < 3; x++) {
                        System.out.print("|");
                        for (i = 0; i < 3; i++) {
                            System.out.print(jogoV[x][i] + " |");
                        }
                        System.out.println();
                    }
                    System.out.println("O jogador 1 venceu!");
                    System.exit(0);
                }
                //Horizontal 3
                if (jogoV[0][2] == 'X' & jogoV[1][2] == 'X' & jogoV[2][2] == 'X') {
                    vit = 1;
                    for (x = 0; x < 3; x++) {
                        System.out.print("|");
                        for (i = 0; i < 3; i++) {
                            System.out.print(jogoV[x][i] + " |");
                        }
                        System.out.println();
                    }
                    System.out.println("O jogador 1 venceu!");
                    System.exit(0);
                }

                //Verificar vitoria Diagonal
                if (jogoV[2][0] == 'X' & jogoV[1][1] == 'X' & jogoV[0][2] == 'X') {
                    vit = 1;
                    for (x = 0; x < 3; x++) {
                        System.out.print("|");
                        for (i = 0; i < 3; i++) {
                            System.out.print(jogoV[x][i] + " |");
                        }
                        System.out.println();
                    }
                    System.out.println("O jogador 1 venceu!");
                    System.exit(0);
                }
                //Verificar vitoria diagonal 2
                if (jogoV[2][2] == 'X' & jogoV[1][1] == 'X' & jogoV[0][0] == 'X') {
                    vit = 1;
                    for (x = 0; x < 3; x++) {
                        System.out.print("|");
                        for (i = 0; i < 3; i++) {
                            System.out.print(jogoV[x][i] + " |");
                        }
                        System.out.println();
                    }
                    System.out.println("O jogador 1 venceu!");
                    System.exit(0);
                }

                //Exibe a tabela atualizada
                for (x = 0; x < 3; x++) {
                    System.out.print("|");
                    for (i = 0; i < 3; i++) {
                        System.out.print(jogoV[x][i] + " |");
                    }
                    System.out.println();
                }
            }

            if (jogador == 2) {
                jogador = 1;

                escolha = Input.readInt("Insira a posição que deseja jogar ");

                //Atribui as letras na matriz
                //Escolha 1
                if (escolha == 1) {
                    jogoV[0][0] = 'O';
                    System.out.println(jogoV[0][0]);
                }
                if (escolha == 2) {
                    jogoV[0][1] = 'O';
                    System.out.println(jogoV[0][1]);
                }
                if (escolha == 3) {
                    jogoV[0][2] = 'O';
                    System.out.println(jogoV[0][2]);
                }
                //Escolha linha 2
                if (escolha == 4) {
                    jogoV[1][0] = 'O';
                    System.out.println(jogoV[0][0]);
                }
                if (escolha == 5) {
                    jogoV[1][1] = 'O';
                    System.out.println(jogoV[0][1]);
                }
                if (escolha == 6) {
                    jogoV[1][2] = 'O';
                    System.out.println(jogoV[0][2]);
                }
                //Escolha linha 3
                if (escolha == 7) {
                    jogoV[2][0] = 'O';
                    System.out.println(jogoV[0][0]);
                }
                if (escolha == 8) {
                    jogoV[2][1] = 'O';
                    System.out.println(jogoV[0][1]);
                }
                if (escolha == 9) {
                    jogoV[2][2] = 'O';
                    System.out.println(jogoV[0][2]);
                }

                //Verifica a vitória na primeira linha
                if (jogoV[0][0] == 'O' & jogoV[0][1] == 'O' & jogoV[0][2] == 'O') {
                    vit = 1;
                    for (x = 0; x < 3; x++) {
                        System.out.print("|");
                        for (i = 0; i < 3; i++) {
                            System.out.print(jogoV[x][i] + " |");
                        }
                        System.out.println();
                    }
                    System.out.println("O jogador 2 venceu!");
                    System.exit(0);
                }
                //Verifica vitoria linha 2
                if (jogoV[1][0] == 'O' & jogoV[1][1] == 'O' & jogoV[1][2] == 'O') {
                    vit = 1;
                    for (x = 0; x < 3; x++) {
                        System.out.print("|");
                        for (i = 0; i < 3; i++) {
                            System.out.print(jogoV[x][i] + " |");
                        }
                        System.out.println();
                    }
                    System.out.println("O jogador 2 venceu!");
                    System.exit(0);
                }
                //Verificar vitoria linha 3
                if (jogoV[2][0] == 'O' & jogoV[2][1] == 'O' & jogoV[2][2] == 'O') {
                    vit = 1;
                    for (x = 0; x < 3; x++) {
                        System.out.print("|");
                        for (i = 0; i < 3; i++) {
                            System.out.print(jogoV[x][i] + " |");
                        }
                        System.out.println();
                    }
                    System.out.println("O jogador 2 venceu!");
                    System.exit(0);
                }
                //Verificar vitória horizontal 1
                if (jogoV[0][0] == 'O' & jogoV[1][0] == 'O' & jogoV[2][0] == 'O') {
                    vit = 1;
                    for (x = 0; x < 3; x++) {
                        System.out.print("|");
                        for (i = 0; i < 3; i++) {
                            System.out.print(jogoV[x][i] + " |");
                        }
                        System.out.println();
                    }
                    System.out.println("O jogador 2 venceu!");
                    System.exit(0);
                }
                //Horizontal 2
                if (jogoV[0][1] == 'O' & jogoV[1][1] == 'O' & jogoV[2][1] == 'O') {
                    vit = 1;
                    for (x = 0; x < 3; x++) {
                        System.out.print("|");
                        for (i = 0; i < 3; i++) {
                            System.out.print(jogoV[x][i] + " |");
                        }
                        System.out.println();
                    }
                    System.out.println("O jogador 1 venceu!");
                    System.exit(0);
                }
                //Horizontal 3
                if (jogoV[0][2] == 'O' & jogoV[1][2] == 'O' & jogoV[2][2] == 'O') {
                    vit = 1;
                    for (x = 0; x < 3; x++) {
                        System.out.print("|");
                        for (i = 0; i < 3; i++) {
                            System.out.print(jogoV[x][i] + " |");
                        }
                        System.out.println();
                    }
                    System.out.println("O jogador 2 venceu!");
                    System.exit(0);
                }

                //Verificar vitoria Diagonal
                if (jogoV[2][0] == 'O' & jogoV[1][1] == 'O' & jogoV[0][2] == 'O') {
                    vit = 1;
                    for (x = 0; x < 3; x++) {
                        System.out.print("|");
                        for (i = 0; i < 3; i++) {
                            System.out.print(jogoV[x][i] + " |");
                        }
                        System.out.println();
                    }
                    System.out.println("O jogador 2 venceu!");
                    System.exit(0);
                }
                //Verificar vitoria diagonal 2
                if (jogoV[2][2] == 'O' & jogoV[1][1] == 'O' & jogoV[0][0] == 'O') {
                    vit = 1;
                    for (x = 0; x < 3; x++) {
                        System.out.print("|");
                        for (i = 0; i < 3; i++) {
                            System.out.print(jogoV[x][i] + " |");
                        }
                        System.out.println();
                    }
                    System.out.println("O jogador 2 venceu!");
                    System.exit(0);
                }

                //Exibe a tabela atualizada
                for (x = 0; x < 3; x++) {
                    System.out.print("|");
                    for (i = 0; i < 3; i++) {
                        System.out.print(jogoV[x][i] + " |");
                    }
                    System.out.println();
                }
            }
        }
    }
}
