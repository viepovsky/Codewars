package simple_beads_count;

class BeadsCounter {
    static int countRedBeads(final int nBlue) {
        return nBlue > 0 ? (nBlue - 1) * 2 : 0;
    }
}
