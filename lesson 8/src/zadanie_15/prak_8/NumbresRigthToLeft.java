package zadanie_15.prak_8;

public class NumbresRigthToLeft {

    public static void Rigth2Left(int num){
        if (num != 0){
            System.out.print(num % 10 + " ");
            Rigth2Left(num / 10);
        }
    }

    public static void main(String[] args) {
        Rigth2Left(12345);
    }
}
//åååååß∂ƒ©ΩΩΩ≈≈≈≈ç√√√√∫∫˜˜˜˜˜˜µµµ≤≤≤≤≥≥≥≥