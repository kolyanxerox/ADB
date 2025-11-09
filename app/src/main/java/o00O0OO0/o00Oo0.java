package o00O0Oo0;

import com.unity3d.services.core.network.domain.CleanupDirectory$invoke$$inlined$sortedBy$1;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import o00O0Oo.OooO0O0;
import o00O0oO.oo0o0Oo;

/* loaded from: classes3.dex */
public final class o00Oo0 implements o00O0o.Oooo000 {

    /* renamed from: OooO00o */
    public final /* synthetic */ int f31391OooO00o;

    /* renamed from: OooO0O0 */
    public final Object f31392OooO0O0;

    /* renamed from: OooO0OO */
    public final Object f31393OooO0OO;

    public o00Oo0(File start, o00Ooo o00ooo2) {
        this.f31391OooO00o = 0;
        kotlin.jvm.internal.OooOo.OooO0o0(start, "start");
        this.f31392OooO0O0 = start;
        this.f31393OooO0OO = o00ooo2;
    }

    @Override // o00O0o.Oooo000
    public final Iterator iterator() {
        switch (this.f31391OooO00o) {
            case 0:
                return new o0OoOo0(this);
            case 1:
                return new o00O0o.OooOo(this);
            case 2:
                o00O0.o00Oo0 o00oo0 = (o00O0.o00Oo0) this.f31392OooO0O0;
                ArrayList arrayList = new ArrayList();
                Iterator it = ((Iterable) o00oo0.f31245OooO0O0).iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next());
                }
                CleanupDirectory$invoke$$inlined$sortedBy$1 cleanupDirectory$invoke$$inlined$sortedBy$1 = (CleanupDirectory$invoke$$inlined$sortedBy$1) this.f31393OooO0OO;
                if (arrayList.size() > 1) {
                    Collections.sort(arrayList, cleanupDirectory$invoke$$inlined$sortedBy$1);
                }
                return arrayList.iterator();
            case 3:
                return new o0OoOo0(this, (byte) 0);
            case 4:
                return new o00O0o.o00oO0o(this);
            default:
                return new oo0o0Oo(this);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public o00Oo0(o00O0o.Oooo000 sequence, o00O0Oo.Oooo000 transformer, int i) {
        this.f31391OooO00o = i;
        switch (i) {
            case 4:
                kotlin.jvm.internal.OooOo.OooO0o0(sequence, "sequence");
                kotlin.jvm.internal.OooOo.OooO0o0(transformer, "transformer");
                this.f31392OooO0O0 = sequence;
                this.f31393OooO0OO = (kotlin.jvm.internal.Oooo000) transformer;
                break;
            default:
                kotlin.jvm.internal.OooOo.OooO0o0(transformer, "predicate");
                this.f31392OooO0O0 = sequence;
                this.f31393OooO0OO = transformer;
                break;
        }
    }

    public o00Oo0(OooO0O0 oooO0O0, o00O0Oo.Oooo000 getNextValue) {
        this.f31391OooO00o = 1;
        kotlin.jvm.internal.OooOo.OooO0o0(getNextValue, "getNextValue");
        this.f31392OooO0O0 = oooO0O0;
        this.f31393OooO0OO = getNextValue;
    }

    public o00Oo0(o00O0.o00Oo0 o00oo0, CleanupDirectory$invoke$$inlined$sortedBy$1 cleanupDirectory$invoke$$inlined$sortedBy$1) {
        this.f31391OooO00o = 2;
        this.f31392OooO0O0 = o00oo0;
        this.f31393OooO0OO = cleanupDirectory$invoke$$inlined$sortedBy$1;
    }

    public o00Oo0(String input, o00O0Oo.o00O0O o00o0o) {
        this.f31391OooO00o = 5;
        kotlin.jvm.internal.OooOo.OooO0o0(input, "input");
        this.f31392OooO0O0 = input;
        this.f31393OooO0OO = o00o0o;
    }
}
