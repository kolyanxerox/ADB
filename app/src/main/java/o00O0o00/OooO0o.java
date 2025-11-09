package o00O0O00;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes3.dex */
public final class OooO0o implements Iterator, o00O0OoO.OooO0OO {

    /* renamed from: OooOo, reason: collision with root package name */
    public int f31333OooOo;

    /* renamed from: OooOo0O, reason: collision with root package name */
    public final OooOO0 f31334OooOo0O;

    /* renamed from: OooOo0o, reason: collision with root package name */
    public int f31335OooOo0o;

    /* renamed from: OooOoO, reason: collision with root package name */
    public final /* synthetic */ int f31336OooOoO;

    /* renamed from: OooOoO0, reason: collision with root package name */
    public int f31337OooOoO0;

    public OooO0o(OooOO0 map, int i) {
        this.f31336OooOoO = i;
        OooOo.OooO0o0(map, "map");
        this.f31334OooOo0O = map;
        this.f31333OooOo = -1;
        this.f31337OooOoO0 = map.f31345OooOoo;
        OooO0O0();
    }

    public final void OooO00o() {
        if (this.f31334OooOo0O.f31345OooOoo != this.f31337OooOoO0) {
            throw new ConcurrentModificationException();
        }
    }

    public final void OooO0O0() {
        while (true) {
            int i = this.f31335OooOo0o;
            OooOO0 oooOO0 = this.f31334OooOo0O;
            if (i >= oooOO0.f31344OooOoOO || oooOO0.f31339OooOo[i] >= 0) {
                return;
            } else {
                this.f31335OooOo0o = i + 1;
            }
        }
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.f31335OooOo0o < this.f31334OooOo0O.f31344OooOoOO;
    }

    @Override // java.util.Iterator
    public final Object next() {
        switch (this.f31336OooOoO) {
            case 0:
                OooO00o();
                int i = this.f31335OooOo0o;
                OooOO0 oooOO0 = this.f31334OooOo0O;
                if (i >= oooOO0.f31344OooOoOO) {
                    throw new NoSuchElementException();
                }
                this.f31335OooOo0o = i + 1;
                this.f31333OooOo = i;
                OooO oooO = new OooO(oooOO0, i);
                OooO0O0();
                return oooO;
            case 1:
                OooO00o();
                int i2 = this.f31335OooOo0o;
                OooOO0 oooOO02 = this.f31334OooOo0O;
                if (i2 >= oooOO02.f31344OooOoOO) {
                    throw new NoSuchElementException();
                }
                this.f31335OooOo0o = i2 + 1;
                this.f31333OooOo = i2;
                Object obj = oooOO02.f31340OooOo0O[i2];
                OooO0O0();
                return obj;
            default:
                OooO00o();
                int i3 = this.f31335OooOo0o;
                OooOO0 oooOO03 = this.f31334OooOo0O;
                if (i3 >= oooOO03.f31344OooOoOO) {
                    throw new NoSuchElementException();
                }
                this.f31335OooOo0o = i3 + 1;
                this.f31333OooOo = i3;
                Object[] objArr = oooOO03.f31341OooOo0o;
                OooOo.OooO0O0(objArr);
                Object obj2 = objArr[this.f31333OooOo];
                OooO0O0();
                return obj2;
        }
    }

    @Override // java.util.Iterator
    public final void remove() {
        OooO00o();
        if (this.f31333OooOo == -1) {
            throw new IllegalStateException("Call next() before removing element from the iterator.");
        }
        OooOO0 oooOO0 = this.f31334OooOo0O;
        oooOO0.OooO0O0();
        oooOO0.OooOOO0(this.f31333OooOo);
        this.f31333OooOo = -1;
        this.f31337OooOoO0 = oooOO0.f31345OooOoo;
    }
}
