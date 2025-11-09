package androidx.collection;

import o00O0O0O.OooO0OO;
import o00O0OO0.OooO;
import o00O0OO0.OooOOO;
import o00O0Oo.o00O0O;
import o00O0o.o000oOoO;
import oo00o.OooOo;

@OooO(m13471c = "androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1", m13472f = "ScatterMap.kt", m13473l = {726}, m13474m = "invokeSuspend")
/* loaded from: classes.dex */
public final class ScatterMap$MapWrapper$keys$1$iterator$1 extends OooOOO implements o00O0O {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    int label;
    final /* synthetic */ ScatterMap<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScatterMap$MapWrapper$keys$1$iterator$1(ScatterMap<K, V> scatterMap, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.this$0 = scatterMap;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        ScatterMap$MapWrapper$keys$1$iterator$1 scatterMap$MapWrapper$keys$1$iterator$1 = new ScatterMap$MapWrapper$keys$1$iterator$1(this.this$0, oooO0OO);
        scatterMap$MapWrapper$keys$1$iterator$1.L$0 = obj;
        return scatterMap$MapWrapper$keys$1$iterator$1;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0097  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0051 -> B:22:0x0095). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0053 -> B:14:0x0064). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:16:0x006d -> B:19:0x008c). Please report as a decompilation issue!!! */
    @Override // o00O0OO0.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r21) {
        /*
            r20 = this;
            r0 = r20
            r1 = 1
            o00O0O0o.OooOo00 r2 = o00O0O0o.OooOo00.f31365OooOo0O
            int r3 = r0.label
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L30
            if (r3 != r1) goto L28
            int r3 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$2
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$1
            java.lang.Object[] r12 = (java.lang.Object[]) r12
            java.lang.Object r13 = r0.L$0
            o00O0o.o000oOoO r13 = (o00O0o.o000oOoO) r13
            o00O0.o000OOo.OooOO0O(r21)
            goto L8c
        L28:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L30:
            o00O0.o000OOo.OooOO0O(r21)
            java.lang.Object r3 = r0.L$0
            o00O0o.o000oOoO r3 = (o00O0o.o000oOoO) r3
            androidx.collection.ScatterMap<K, V> r6 = r0.this$0
            java.lang.Object[] r7 = r6.keys
            long[] r6 = r6.metadata
            int r8 = r6.length
            int r8 = r8 + (-2)
            if (r8 < 0) goto L99
            r9 = r4
        L43:
            r10 = r6[r9]
            long r12 = ~r10
            r14 = 7
            long r12 = r12 << r14
            long r12 = r12 & r10
            r14 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r12 = r12 & r14
            int r12 = (r12 > r14 ? 1 : (r12 == r14 ? 0 : -1))
            if (r12 == 0) goto L95
            int r12 = r9 - r8
            int r12 = ~r12
            int r12 = r12 >>> 31
            int r12 = 8 - r12
            r13 = r3
            r3 = r4
            r18 = r10
            r11 = r6
            r10 = r8
            r6 = r12
            r12 = r7
            r7 = r18
        L64:
            if (r3 >= r6) goto L8f
            r14 = 255(0xff, double:1.26E-321)
            long r14 = r14 & r7
            r16 = 128(0x80, double:6.3E-322)
            int r14 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r14 >= 0) goto L8c
            int r4 = r9 << 3
            int r4 = r4 + r3
            r4 = r12[r4]
            r0.L$0 = r13
            r0.L$1 = r12
            r0.L$2 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r3
            r0.label = r1
            r13.OooO00o(r4, r0)
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            return r2
        L8c:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L64
        L8f:
            if (r6 != r5) goto L99
            r8 = r10
            r6 = r11
            r7 = r12
            r3 = r13
        L95:
            if (r9 == r8) goto L99
            int r9 = r9 + r1
            goto L43
        L99:
            oo00o.OooOo r1 = oo00o.OooOo.f33195OooO00o
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.ScatterMap$MapWrapper$keys$1$iterator$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000oOoO o000oooo2, OooO0OO oooO0OO) {
        return ((ScatterMap$MapWrapper$keys$1$iterator$1) create(o000oooo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
