package o00O0o;

import java.util.Iterator;
import java.util.NoSuchElementException;
import o00O0Oo.OooO0O0;
import o00O0OoO.OooO0OO;

/* loaded from: classes3.dex */
public final class OooOo implements Iterator, OooO0OO {

    /* renamed from: OooOo, reason: collision with root package name */
    public Object f31412OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f31413OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f31414OooOo0o;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public final /* synthetic */ Oooo000 f31415OooOoO0;

    public OooOo(oo000o oo000oVar) {
        this.f31413OooOo0O = 1;
        this.f31415OooOoO0 = oo000oVar;
        this.f31412OooOo = oo000oVar.f31433OooO00o.iterator();
    }

    public void OooO00o() {
        Object objInvoke;
        int i = this.f31414OooOo0o;
        o00O0Oo0.o00Oo0 o00oo0 = (o00O0Oo0.o00Oo0) this.f31415OooOoO0;
        if (i == -2) {
            objInvoke = ((OooO0O0) o00oo0.f31392OooO0O0).invoke();
        } else {
            o00O0Oo.Oooo000 oooo000 = (o00O0Oo.Oooo000) o00oo0.f31393OooO0OO;
            Object obj = this.f31412OooOo;
            kotlin.jvm.internal.OooOo.OooO0O0(obj);
            objInvoke = oooo000.invoke(obj);
        }
        this.f31412OooOo = objInvoke;
        this.f31414OooOo0o = objInvoke == null ? 0 : 1;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        oo000o oo000oVar;
        Iterator it;
        switch (this.f31413OooOo0O) {
            case 0:
                if (this.f31414OooOo0o < 0) {
                    OooO00o();
                }
                return this.f31414OooOo0o == 1;
        }
        while (true) {
            int i = this.f31414OooOo0o;
            oo000oVar = (oo000o) this.f31415OooOoO0;
            int i2 = oo000oVar.f31434OooO0O0;
            it = (Iterator) this.f31412OooOo;
            if (i < i2 && it.hasNext()) {
                it.next();
                this.f31414OooOo0o++;
            }
        }
        return this.f31414OooOo0o < oo000oVar.f31435OooO0OO && it.hasNext();
    }

    @Override // java.util.Iterator
    public final Object next() {
        oo000o oo000oVar;
        Iterator it;
        switch (this.f31413OooOo0O) {
            case 0:
                if (this.f31414OooOo0o < 0) {
                    OooO00o();
                }
                if (this.f31414OooOo0o == 0) {
                    throw new NoSuchElementException();
                }
                Object obj = this.f31412OooOo;
                kotlin.jvm.internal.OooOo.OooO0OO(obj, "null cannot be cast to non-null type T of kotlin.sequences.GeneratorSequence");
                this.f31414OooOo0o = -1;
                return obj;
        }
        while (true) {
            int i = this.f31414OooOo0o;
            oo000oVar = (oo000o) this.f31415OooOoO0;
            int i2 = oo000oVar.f31434OooO0O0;
            it = (Iterator) this.f31412OooOo;
            if (i < i2 && it.hasNext()) {
                it.next();
                this.f31414OooOo0o++;
            }
        }
        int i3 = this.f31414OooOo0o;
        if (i3 >= oo000oVar.f31435OooO0OO) {
            throw new NoSuchElementException();
        }
        this.f31414OooOo0o = i3 + 1;
        return it.next();
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f31413OooOo0O) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public OooOo(o00O0Oo0.o00Oo0 o00oo0) {
        this.f31413OooOo0O = 0;
        this.f31415OooOoO0 = o00oo0;
        this.f31414OooOo0o = -2;
    }
}
