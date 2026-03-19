void main () {
    String msg = "Welcome to ABES";
    System.out.println("Original Msg: ");
    System.out.println(msg);

    String encodeMsg = Base64.getEncoder().encodeToString(msg.getBytes());
    System.out.println("Encoded Msg: ");
    System.out.println(encodeMsg);

    byte []decodeBytes = Base64.getDecoder().decode(encodeMsg);
    String decodeMsg = new String(decodeBytes);
    System.out.println("Decoded Msg: ");
    System.out.println(decodeMsg);
}