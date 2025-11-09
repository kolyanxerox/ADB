package kotlin.jvm.internal;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* loaded from: classes3.dex */
public class OooO0O0 implements Iterator, o00O0OoO.OooO0OO {

    /* renamed from: OooOo, reason: collision with root package name */
    public final Object f28870OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final /* synthetic */ int f28871OooOo0O = 1;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f28872OooOo0o;

    public OooO0O0(Object[] array) {
        OooOo.OooO0o0(array, "array");
        this.f28870OooOo = array;
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        switch (this.f28871OooOo0O) {
            case 0:
                if (this.f28872OooOo0o < ((Object[]) this.f28870OooOo).length) {
                }
                break;
            case 1:
                if (this.f28872OooOo0o < ((o00O0.OooO) this.f28870OooOo).size()) {
                }
                break;
            default:
                if (this.f28872OooOo0o > 0) {
                }
                break;
        }
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f28871OooOo0O) {
            case 0:
                try {
                    Object[] objArr = (Object[]) this.f28870OooOo;
                    int i = this.f28872OooOo0o;
                    this.f28872OooOo0o = i + 1;
                    return objArr[i];
                } catch (ArrayIndexOutOfBoundsException e) {
                    this.f28872OooOo0o--;
                    throw new NoSuchElementException(e.getMessage());
                }
            case 1:
                if (!hasNext()) {
                    throw new NoSuchElementException();
                }
                int i2 = this.f28872OooOo0o;
                this.f28872OooOo0o = i2 + 1;
                return ((o00O0.OooO) this.f28870OooOo).get(i2);
            default:
                o00OO0o.OooO oooO = (o00OO0o.OooO) this.f28870OooOo;
                int iOooO0Oo = oooO.OooO0Oo();
                int i3 = this.f28872OooOo0o;
                this.f28872OooOo0o = i3 - 1;
                return oooO.OooO0oO(iOooO0Oo - i3);
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        switch (this.f28871OooOo0O) {
            case 0:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            case 1:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
            default:
                throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    public OooO0O0(o00O0.OooO oooO) {
        this.f28870OooOo = oooO;
    }

    public OooO0O0(o00OO0o.OooO oooO) {
        this.f28870OooOo = oooO;
        this.f28872OooOo0o = oooO.OooO0Oo();
    }
}
