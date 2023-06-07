
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chungDoan
 */
public class servletWS extends HttpServlet{

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {

        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        try ( PrintWriter out = resp.getWriter()) {
            String userInput = req.getParameter("inputUser");
            int n;
            if(userInput == null || userInput.isEmpty()){
                out.print("ur input empty!");
                return;
            }
            try {
                n = Integer.parseInt(userInput);
            } catch (NumberFormatException e) {
                out.println("Wrong! ur input must be so");
                return;
            }
            // check input in range 1 and 100
            if (n <= 1 || n >= 100) {
                out.println("Wrong! Please enter a number between 1 and 100.");
                return;
            } 
            
            String selectedOperation = req.getParameter("problem");
            if (selectedOperation.equals("tong")) {
                int sum = tongLienTiep(n);
                out.println("Tong cua " + n + " so lien tiep dau tien la: " + sum);
            } else if (selectedOperation.equals("giaiThua")) {
                int gt = giaiThua(n);
                out.print("Giai thua la: " + gt);
            }else if (selectedOperation.equals("le")){
                String dayLe = showLe(n);
                out.print(dayLe);
            }else if (selectedOperation.equals("chan")){
                String dayChan = showChan(n);
                out.print(dayChan);
            }else if (selectedOperation.equals("soNguyenTo")) {
                if (checkSNT(n)) {
                    out.print(n + " la so nguyen tor");
                } else {
                    out.print(n + " khong phai so nguyen to");
                }
            }
        }
    }
    
    public int tongLienTiep(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        return sum;
    }
    
    public int giaiThua(int n){
        int giaithua = 1;
        for (int i = 1; i <= n; i++) {
            giaithua *= i;
        }
        return giaithua;
    }

    public String showLe(int n) {
        String soLe = "";
        for (int i = 1; i <= n; i += 2) {
            soLe += i + " ";
        }
        return soLe.trim();
    }

    public String showChan(int n) {
        String soChan = "";
        for (int i = 2; i <= n; i += 2) {
            soChan += i + " ";
        }
        return soChan.trim();
    }

    public boolean checkSNT(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }


}