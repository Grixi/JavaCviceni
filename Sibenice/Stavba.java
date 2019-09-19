public class Stavba{
  public String sibenice(int trest, String slovo){
    String result = "";
    switch (trest)
    {
        case 7:
            result = ("      ___________\n"
                             + "     ││        I\n"
                             + "     ││       ( )\n"
                             + "     ││        │\n"
                             + "     ││       /│\\\n"
                             + "     ││        │\n"
                             + "     ││       / \\\n"
                             + "    .---.\n"
                             + "   /     \\ \n"
                             + "Prohrál jste!\n"
                                      + "Hledané slovo bylo: " + slovo);
            break;
        case 6:
            result = ("      ___________\n"
                             + "     ││        I\n"
                             + "     ││       ( )\n"
                             + "     ││        │\n"
                             + "     ││        │\n"
                             + "     ││        │\n"
                             + "     ││       / \\\n"
                             + "    .---.\n"
                             + "   /     \\");
            break;
        case 5:
            result = ("      ___________\n"
                             + "     ││        I\n"
                             + "     ││       ( )\n"
                             + "     ││        │\n"
                             + "     ││        │\n"
                             + "     ││        │\n"
                             + "     ││\n"
                             + "    .---.\n"
                             + "   /     \\");
            break;
        case 4:
            result = ("      ___________\n"
                             + "     ││        I\n"
                             + "     ││       ( )\n"
                             + "     ││\n"
                             + "     ││\n"
                             + "     ││\n"
                             + "     ││\n"
                             + "    .---.\n"
                             + "   /     \\");
            break;
        case 3:
            result = ("      ___________\n"
                             + "     ││        I\n"
                             + "     ││\n"
                             + "     ││\n"
                             + "     ││\n"
                             + "     ││\n"
                             + "     ││\n"
                             + "    .---.\n"
                             + "   /     \\");
            break;
        case 2:
            result = ("\n     ││\n"
                             + "     ││\n"
                             + "     ││\n"
                             + "     ││\n"
                             + "     ││\n"
                             + "     ││\n"
                             + "    .---.\n"
                             + "   /     \\");
            break;
        case 1:
            result = ("\n\n\n\n\n\n\n    .---.\n"
                             + "   /     \\");
            break;
        default :
    }

    return result;
  }
}
