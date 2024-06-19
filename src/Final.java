/*
 * 이 프로그램은 swing을 이용하여 스크롤 윈도우 패널에 
 * 구구단을 출력하는 간단한 프로그램입니다.
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Final extends JFrame {
    private JTextArea resultArea;

    public Final() {
        setTitle("구구단");
        setSize(500, 400);
        WindowAdapter wa = new WindowAdapter() {
            public void windowClosing(WindowEvent e) {
                System.exit(0);
            }
        };
        this.addWindowListener(wa);
        setLocationRelativeTo(null);

        // 패널 생성
        JPanel panel = new JPanel();
        panel.setLayout(new BorderLayout());

        // 결과 출력 영역
        resultArea = new JTextArea();
        resultArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(resultArea);

        panel.add(scrollPane, BorderLayout.CENTER);
        add(panel);

        printGugudan();
    }

    private void printGugudan() {
        for(int i = 2; i < 10; i++) {
            System.out.println(i + "단을 출력 합니다.");

            for(int j = 1; j < 10; j++) {
                System.out.println(i + " x " + j + " = "+ i * j);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Final();
            } 
        });
    }
}
