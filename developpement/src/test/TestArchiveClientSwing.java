package test;

import view.ArchiveClientSwing;
import view.AjoutClientSwing;

public class TestArchiveClientSwing {
    public static void main(String[] args) {
        new ArchiveClientSwing(AjoutClientSwing.getClients());
    }
}
