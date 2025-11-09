package o00Oo00;

import java.io.IOException;
import java.io.InputStream;
import java.io.Serializable;
import java.util.UUID;
import o00OOooO.oOO00O;

/* loaded from: classes3.dex */
public abstract class OooO0o extends OooO0OO {
    private final Serializable tag;

    public OooO0o(InputStream inputStream) {
        super(inputStream);
        this.tag = UUID.randomUUID();
    }

    @Override // o00Oo00.OooO0OO
    public void handleIOException(IOException iOException) throws IOException {
        throw new oOO00O(iOException, this.tag);
    }

    public boolean isCauseOf(Throwable th) {
        Serializable serializable = this.tag;
        int i = oOO00O.f32645OooOo0o;
        return serializable != null && (th instanceof oOO00O) && serializable.equals(((oOO00O) th).f32646OooOo0O);
    }

    public void throwIfCauseOf(Throwable th) throws IOException {
        Serializable serializable = this.tag;
        int i = oOO00O.f32645OooOo0o;
        if (serializable != null && (th instanceof oOO00O) && serializable.equals(((oOO00O) th).f32646OooOo0O)) {
            throw ((oOO00O) th).getCause();
        }
    }
}
