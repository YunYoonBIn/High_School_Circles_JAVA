import java.util.Scanner;
 
public class Star {
 
    public static void main(String[] args) {
        /* �� �׸��� - �ٸ� 5�� */
        
        System.out.println("���ڸ� �Է����ּ���.");
        Scanner input = new Scanner(System.in);
        
        int answer;                    // �Է¹��� ����
        int heigt;                     // �� ���� ����
        int width;                     // �� ���� ����
        int center;                    // ���� �߰� ����
        int top;                       // �Ӹ� ���� ����
        int middle;                    // ���� ���� ����
        int bottom;                    // �ٸ� ���� ����
        
        // �Է¹��� ���� ����
        answer = input.nextInt();
        
        // �� ���� ���� ����
        heigt = answer * 9;
        
        // �� ���� ���� ����
        width = answer * 15;
        
        // ���� ���̰� ¦���� ��� + 1
        if(width % 2 == 0) {
            width += 1;
        }
        
        // ���� �߰� ���� ����
        center = width / 2;
        
        // �Ӹ�,����,�ٸ� ���� ��ġ ����
        top = heigt / 3;
        middle = top * 2;
        bottom = top * 3;
        
        /*
        System.out.println("�Է��� ���� = " + answer);    // �Է¹��� ����
        System.out.println("�� ���� ���� = " + heigt);    // �� ���� ����
        System.out.println("�� ���� ���� = " + width);    // �� ���� ����
        System.out.println("���� �߰� ���� = " + center);  // ���� �߰� ����
        System.out.println("��� = " + top);             // ���
        System.out.println("�߰� = " + middle);          // �߰�
        System.out.println("�ϴ� = " + bottom);          // �ϴ�
        */
        
        char[][] star = new char[heigt][width]; // ���� ����, ���� ���̷� �迭 ����
        
        int start;       // ���� ���� 
        int end;         // ���� ����
        int startBottom; // �ϴ� ���� ����
        int endBottom;   // �ϴ� ���� ����
        
        // �� �Ӹ� ����
        start = center;
        end = center;
        for(int a = 0 ; a < top ; a++){
            for(int b = 0 ; b < width ; b++){
                if(start <= b && b <= end) {
                    star[a][b] = '*';
                }else {
                    star[a][b] = ' ';
                }
            }
            
            start--;
            end++;
        }
        
        // �� ���� ����
        start = 0;
        end = width - 1;
        for(int a = top ; a < middle ; a++){
            for(int b = 0 ; b < width ; b++){
                if(start <= b && b <= end) {
                    star[a][b] = '*';
                }else {
                    star[a][b] = ' ';
                }
            }
            
            start++;
            end--;
        }        
 
        // �� �ٸ� ����
        startBottom = center;
        endBottom = center;
        for(int a = middle ; a < bottom ; a++){
            for(int b = 0 ; b < width ; b++){
                if(startBottom <= b && b <= endBottom) {
                    star[a][b] = ' ';
                }else {
                    star[a][b] = '*';
                }
                
                if(start -1 > b || end +1 < b) {
                    star[a][b] = ' ';
                }
            }        
            
            start--;
            end++;
            startBottom -= 3;
            endBottom += 3;    
        }
        
        // �� �迭 ���
        for(int a=0 ; a < heigt ; a++){
            for(int b=0 ; b < width ; b++){
                System.out.print(star[a][b]);
            }
            System.out.println();
        }
    }
}
