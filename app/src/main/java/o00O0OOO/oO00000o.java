package o00O0ooo;

import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.jvm.internal.OooOo;
import o00O.OooO0O0;
import o00O.OooO0OO;
import o00O.OooO0o;
import o00O.o00Oo0;
import o00O0O0O.OooOOO0;
import o00O0oOo.oo0o0Oo;
import o00O0oo.o0000oo;

/* loaded from: classes3.dex */
public final class oO00000o extends OooO0O0 implements o0OO, o0OoOoOo, o00Oo0 {

    /* renamed from: OooOoO */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f31829OooOoO = AtomicReferenceFieldUpdater.newUpdater(oO00000o.class, Object.class, "_state$volatile");

    /* renamed from: OooOoO0 */
    public int f31830OooOoO0;
    private volatile /* synthetic */ Object _state$volatile;

    public oO00000o(Object obj) {
        this._state$volatile = obj;
    }

    public final boolean OooO(Object obj, Object obj2) {
        int i;
        OooO0o[] oooO0oArr;
        o000O0O0.OooO0O0 oooO0O0;
        synchronized (this) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f31829OooOoO;
            Object obj3 = atomicReferenceFieldUpdater.get(this);
            if (obj != null && !OooOo.OooO00o(obj3, obj)) {
                return false;
            }
            if (OooOo.OooO00o(obj3, obj2)) {
                return true;
            }
            atomicReferenceFieldUpdater.set(this, obj2);
            int i2 = this.f31830OooOoO0;
            if ((i2 & 1) != 0) {
                this.f31830OooOoO0 = i2 + 2;
                return true;
            }
            int i3 = i2 + 1;
            this.f31830OooOoO0 = i3;
            OooO0o[] oooO0oArr2 = this.f31168OooOo0O;
            while (true) {
                oO0000O[] oo0000oArr = (oO0000O[]) oooO0oArr2;
                if (oo0000oArr != null) {
                    for (oO0000O oo0000o : oo0000oArr) {
                        if (oo0000o != null) {
                            AtomicReference atomicReference = oo0000o.f31831OooO00o;
                            while (true) {
                                Object obj4 = atomicReference.get();
                                if (obj4 != null && obj4 != (oooO0O0 = o0o0000.f31805OooO0OO)) {
                                    o000O0O0.OooO0O0 oooO0O02 = o0o0000.f31804OooO0O0;
                                    if (obj4 != oooO0O02) {
                                        while (!atomicReference.compareAndSet(obj4, oooO0O02)) {
                                            if (atomicReference.get() != obj4) {
                                                break;
                                            }
                                        }
                                        ((oo0o0Oo) obj4).resumeWith(oo00o.OooOo.f33195OooO00o);
                                        break;
                                    }
                                    while (!atomicReference.compareAndSet(obj4, oooO0O0)) {
                                        if (atomicReference.get() != obj4) {
                                            break;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                synchronized (this) {
                    i = this.f31830OooOoO0;
                    if (i == i3) {
                        this.f31830OooOoO0 = i3 + 1;
                        return true;
                    }
                    oooO0oArr = this.f31168OooOo0O;
                }
                oooO0oArr2 = oooO0oArr;
                i3 = i;
            }
        }
    }

    @Override // o00O0ooo.o0OO0oO0
    public final boolean OooO00o(Object obj) {
        OooO0oo(obj);
        return true;
    }

    @Override // o00O.o00Oo0
    public final o0OoOoOo OooO0O0(OooOOO0 oooOOO0, int i, o0000oo o0000ooVar) {
        return (((i < 0 || i >= 2) && i != -2) || o0000ooVar != o0000oo.f31603OooOo0o) ? o0o0000.OooOOOo(this, oooOOO0, i, o0000ooVar) : this;
    }

    @Override // o00O.OooO0O0
    public final OooO0o OooO0Oo() {
        return new oO0000O();
    }

    @Override // o00O.OooO0O0
    public final OooO0o[] OooO0o0() {
        return new oO0000O[2];
    }

    public final boolean OooO0oO(Object obj, Object obj2) {
        o000O0O0.OooO0O0 oooO0O0 = OooO0OO.f31171OooO0O0;
        if (obj == null) {
            obj = oooO0O0;
        }
        if (obj2 == null) {
            obj2 = oooO0O0;
        }
        return OooO(obj, obj2);
    }

    public final void OooO0oo(Object obj) {
        if (obj == null) {
            obj = OooO0OO.f31171OooO0O0;
        }
        OooO(null, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:110:0x007e, code lost:
    
        if (((o00O0ooo.oO0000o0) r0).OooO0O0(r3) == r4) goto L149;
     */
    /* JADX WARN: Code restructure failed: missing block: B:156:0x0097, code lost:
    
        if (r6 != r4) goto L117;
     */
    /* JADX WARN: Path cross not found for [B:125:0x00ad, B:127:0x00b3], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:127:0x00b3, B:125:0x00ad], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:127:0x00b3, B:135:0x00ce], limit reached: 74 */
    /* JADX WARN: Path cross not found for [B:147:0x0112, B:148:0x0113], limit reached: 74 */
    /* JADX WARN: Removed duplicated region for block: B:119:0x009f A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:94:0x0039, B:117:0x0097, B:119:0x009f, B:122:0x00a6, B:123:0x00aa, B:125:0x00ad, B:135:0x00ce, B:138:0x00de, B:139:0x00f8, B:145:0x010a, B:142:0x0101, B:144:0x0107, B:127:0x00b3, B:131:0x00ba, B:101:0x0052, B:104:0x005d, B:116:0x0088), top: B:154:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ad A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:94:0x0039, B:117:0x0097, B:119:0x009f, B:122:0x00a6, B:123:0x00aa, B:125:0x00ad, B:135:0x00ce, B:138:0x00de, B:139:0x00f8, B:145:0x010a, B:142:0x0101, B:144:0x0107, B:127:0x00b3, B:131:0x00ba, B:101:0x0052, B:104:0x005d, B:116:0x0088), top: B:154:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:129:0x00b7  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x00dd  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x00de A[Catch: all -> 0x003d, TryCatch #1 {all -> 0x003d, blocks: (B:94:0x0039, B:117:0x0097, B:119:0x009f, B:122:0x00a6, B:123:0x00aa, B:125:0x00ad, B:135:0x00ce, B:138:0x00de, B:139:0x00f8, B:145:0x010a, B:142:0x0101, B:144:0x0107, B:127:0x00b3, B:131:0x00ba, B:101:0x0052, B:104:0x005d, B:116:0x0088), top: B:154:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0019  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:137:0x00dd -> B:117:0x0097). Please report as a decompilation issue!!! */
    @Override // o00O0ooo.o0OoOoOo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object collect(o00O0ooo.o0O000Oo r17, o00O0O0O.OooO0OO r18) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: o00O0ooo.oO00000o.collect(o00O0ooo.o0O000Oo, o00O0O0O.OooO0OO):java.lang.Object");
    }

    @Override // o00O0ooo.o0OO0oO0, o00O0ooo.o0O000Oo
    public final Object emit(Object obj, o00O0O0O.OooO0OO oooO0OO) {
        OooO0oo(obj);
        return oo00o.OooOo.f33195OooO00o;
    }

    @Override // o00O0ooo.InterfaceC4522o
    public final Object getValue() {
        o000O0O0.OooO0O0 oooO0O0 = OooO0OO.f31171OooO0O0;
        Object obj = f31829OooOoO.get(this);
        if (obj == oooO0O0) {
            return null;
        }
        return obj;
    }
}
