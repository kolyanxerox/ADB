package oo0o0O0;

import java.io.Serializable;
import kotlin.jvm.internal.OooOo;
import o00O0.OooO;
import o00O0.OooOOO;

/* loaded from: classes3.dex */
public final class OooO0O0 extends OooO implements OooO00o, Serializable {

    /* renamed from: OooOo0O */
    public final Enum[] f33205OooOo0O;

    public OooO0O0(Enum[] entries) {
        OooOo.OooO0o0(entries, "entries");
        this.f33205OooOo0O = entries;
    }

    @Override // o00O0.OooO00o, java.util.Collection, java.util.List
    public final boolean contains(Object obj) {
        if (!(obj instanceof Enum)) {
            return false;
        }
        Enum element = (Enum) obj;
        OooOo.OooO0o0(element, "element");
        return ((Enum) OooOOO.o000oOoO(element.ordinal(), this.f33205OooOo0O)) == element;
    }

    @Override // java.util.List
    public final Object get(int i) {
        o00O0.OooO0O0 oooO0O0 = OooO.Companion;
        Enum[] enumArr = this.f33205OooOo0O;
        int length = enumArr.length;
        oooO0O0.getClass();
        o00O0.OooO0O0.OooO00o(i, length);
        return enumArr[i];
    }

    @Override // o00O0.OooO00o
    public final int getSize() {
        return this.f33205OooOo0O.length;
    }

    @Override // o00O0.OooO, java.util.List
    public final int indexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        OooOo.OooO0o0(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) OooOOO.o000oOoO(iOrdinal, this.f33205OooOo0O)) == element) {
            return iOrdinal;
        }
        return -1;
    }

    @Override // o00O0.OooO, java.util.List
    public final int lastIndexOf(Object obj) {
        if (!(obj instanceof Enum)) {
            return -1;
        }
        Enum element = (Enum) obj;
        OooOo.OooO0o0(element, "element");
        int iOrdinal = element.ordinal();
        if (((Enum) OooOOO.o000oOoO(iOrdinal, this.f33205OooOo0O)) == element) {
            return iOrdinal;
        }
        return -1;
    }
}
