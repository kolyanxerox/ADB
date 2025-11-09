package o00O0Oo0;

import java.io.BufferedReader;
import java.io.IOException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import o00O0OoO.OooO0OO;

/* loaded from: classes3.dex */
public final class o00oO0o implements Iterator, OooO0OO {

    /* renamed from: OooOo */
    public final /* synthetic */ o00O0.o00Oo0 f31396OooOo;

    /* renamed from: OooOo0O */
    public String f31397OooOo0O;

    /* renamed from: OooOo0o */
    public boolean f31398OooOo0o;

    public o00oO0o(o00O0.o00Oo0 o00oo0) {
        this.f31396OooOo = o00oo0;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() throws IOException {
        if (this.f31397OooOo0O == null && !this.f31398OooOo0o) {
            String line = ((BufferedReader) this.f31396OooOo.f31245OooO0O0).readLine();
            this.f31397OooOo0O = line;
            if (line == null) {
                this.f31398OooOo0o = true;
            }
        }
        return this.f31397OooOo0O != null;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        String str = this.f31397OooOo0O;
        this.f31397OooOo0O = null;
        kotlin.jvm.internal.OooOo.OooO0O0(str);
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
