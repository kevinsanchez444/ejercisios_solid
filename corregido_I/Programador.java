public class Programador implements trabajarEnOficina, trabajarRemoto, escribirCodigo {
    public void trabajarEnOficina() { /* ...ok... */ }
    public void trabajarRemoto()    { /* ...ok... */ }
    public void gestionarEquipo()   { throw new UnsupportedOperationException(); }
    public void escribirCodigo()    { /* ...ok... */ }
    public void atenderClientes()   { throw new UnsupportedOperationException(); }
}