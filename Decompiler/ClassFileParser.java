import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class JavaClassFileParser {

    public static void main(String[] args) {
        try {
            parseClassFile("HelloWorld.class");
        } catch (IOException e) {
            System.err.println("Error while parsing .class file: " + e.getMessage());
        }
    }

    public static void parseClassFile(String filename) throws IOException {
        try (DataInputStream dis = new DataInputStream(new FileInputStream(filename))) {
            int magicNumber = dis.readInt();
            if (magicNumber != 0xCAFEBABE) {
                throw new IllegalArgumentException("Invalid Java .class file");
            }

            int minorVersion = dis.readUnsignedShort();
            int majorVersion = dis.readUnsignedShort();

            System.out.println("Magic Number: " + Integer.toHexString(magicNumber));
            System.out.println("Minor Version: " + minorVersion);
            System.out.println("Major Version: " + majorVersion);

            // Parse constant pool
            int constantPoolCount = dis.readUnsignedShort();
            System.out.println("Constant Pool Count: " + constantPoolCount);

            for (int i = 1; i < constantPoolCount; i++) {
                int tag = dis.readUnsignedByte();
                switch (tag) {
                    case 1: // CONSTANT_Utf8
                        String utf8String = dis.readUTF();
                        System.out.println("CONSTANT_Utf8: " + utf8String);
                        break;
                    // Handle other constant types
                    // ...
                }
            }
            // TODO: 
            // Continue parsing the .class file
            // 1. Parse class access flags, this class, super class, and interfaces
            // 2. Parse fields
            // 3. Parse methods
            // 4. Parse attributes
        }
    }
}
