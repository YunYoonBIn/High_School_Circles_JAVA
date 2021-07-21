import java.util.Scanner;
 
public class Star {
 
    public static void main(String[] args) {
        /* 별 그리기 - 다리 5개 */
        
        System.out.println("숫자를 입력해주세요.");
        Scanner input = new Scanner(System.in);
        
        int answer;                    // 입력받은 정수
        int heigt;                     // 별 세로 길이
        int width;                     // 별 가로 길이
        int center;                    // 가로 중간 지점
        int top;                       // 머리 종료 지점
        int middle;                    // 몸통 종료 지점
        int bottom;                    // 다리 종료 지점
        
        // 입력받은 정수 저장
        answer = input.nextInt();
        
        // 별 세로 길이 생성
        heigt = answer * 9;
        
        // 별 가로 길이 생성
        width = answer * 15;
        
        // 가로 길이가 짝수일 경우 + 1
        if(width % 2 == 0) {
            width += 1;
        }
        
        // 가로 중간 지점 생성
        center = width / 2;
        
        // 머리,몸통,다리 종료 위치 지정
        top = heigt / 3;
        middle = top * 2;
        bottom = top * 3;
        
        /*
        System.out.println("입력한 정수 = " + answer);    // 입력받은 정수
        System.out.println("총 세로 길이 = " + heigt);    // 별 세로 길이
        System.out.println("총 가로 길이 = " + width);    // 별 가로 길이
        System.out.println("가로 중간 지점 = " + center);  // 가로 중간 지점
        System.out.println("상단 = " + top);             // 상단
        System.out.println("중간 = " + middle);          // 중간
        System.out.println("하단 = " + bottom);          // 하단
        */
        
        char[][] star = new char[heigt][width]; // 별의 세로, 가로 길이로 배열 생성
        
        int start;       // 시작 지점 
        int end;         // 종료 지점
        int startBottom; // 하단 시작 지점
        int endBottom;   // 하단 종료 지점
        
        // 별 머리 생성
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
        
        // 별 몸통 생성
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
 
        // 별 다리 생성
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
        
        // 별 배열 출력
        for(int a=0 ; a < heigt ; a++){
            for(int b=0 ; b < width ; b++){
                System.out.print(star[a][b]);
            }
            System.out.println();
        }
    }
}
