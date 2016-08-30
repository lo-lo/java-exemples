package exersize;

/**
 * ��� ��������� �������� � �������� ���������� � ��������� ������ ��� ����� � ������ � ��������
 * ��������� �������� ������, ������������ ��������� �������.
 **/

public class PartStr {
    public static void main(String[] args) {
        //������������ ���������� ��� ������ ������ catch.
        try {
            //System.out.println("\"������: java PartStr <�����1> <�����2> <������>\"");
            int xbegin = Integer.parseInt(args[0]); // ����������� ������ �������� � �����
            if (xbegin < 0) throw new IllegalArgumentException("<�����1> ������� ���� ��������������� ");
            int xend = Integer.parseInt(args[1]); // ����������� ������ �������� � �����
            if (xend <= xbegin) throw new IllegalArgumentException("<�����2> ������� ���� ������, ��� <�����1>. ");
            //String str = args[2];
            if (args[2].length()<xend) throw new IllegalArgumentException("����� ������ ������� ���� �� ������, ��� <�����2>. ");
            System.out.println("��������� �������� ������: ");

            for(int i = 0; i<args[2].length(); i++)
            { if((i>=xbegin) && (i<=xend))
                System.out.print(args[2].charAt(i));
            }
            System.out.println();

        }
        //������������ ����� ������ ��������
        //���������� ���������, ���� args[0] �������� ��������������
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("�� ������ ������ ���������");
            System.out.println("������: java PartStr <�����1> <�����2> <������>");
        }
        //�������� �� �������� ������. �������� ������� Integer.parseInt()
        catch (NumberFormatException e) {
            System.out.println("���������� �������� ������ ���� ����� ������");
        }

    }
}