package androidx.collection;

import o00O0O0O.OooO0OO;
import o00O0OO0.OooO;
import o00O0OO0.OooOOO;
import o00O0Oo.o00O0O;
import o00O0o.o000oOoO;
import oo00o.OooOo;

@OooO(m13471c = "androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1", m13472f = "ScatterMap.kt", m13473l = {1511}, m13474m = "invokeSuspend")
/* renamed from: androidx.collection.MutableScatterMap$MutableMapWrapper$values$1$iterator$1$iterator$1 */
/* loaded from: classes.dex */
public final class C0156x9ca97416 extends OooOOO implements o00O0O {
    int I$0;
    int I$1;
    int I$2;
    int I$3;
    long J$0;
    private /* synthetic */ Object L$0;
    Object L$1;
    int label;
    final /* synthetic */ MutableScatterMap<K, V> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0156x9ca97416(MutableScatterMap<K, V> mutableScatterMap, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.this$0 = mutableScatterMap;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        C0156x9ca97416 c0156x9ca97416 = new C0156x9ca97416(this.this$0, oooO0OO);
        c0156x9ca97416.L$0 = obj;
        return c0156x9ca97416;
    }

    /* JADX WARN: Removed duplicated region for block: B:39:0x004d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0093  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:38:0x004b -> B:48:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x004d -> B:40:0x005f). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:42:0x0068 -> B:45:0x0088). Please report as a decompilation issue!!! */
    @Override // o00O0OO0.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            r19 = this;
            r0 = r19
            r1 = 1
            o00O0O0o.OooOo00 r2 = o00O0O0o.OooOo00.f31365OooOo0O
            int r3 = r0.label
            r4 = 0
            r5 = 8
            if (r3 == 0) goto L2c
            if (r3 != r1) goto L24
            int r3 = r0.I$3
            int r6 = r0.I$2
            long r7 = r0.J$0
            int r9 = r0.I$1
            int r10 = r0.I$0
            java.lang.Object r11 = r0.L$1
            long[] r11 = (long[]) r11
            java.lang.Object r12 = r0.L$0
            o00O0o.o000oOoO r12 = (o00O0o.o000oOoO) r12
            o00O0.o000OOo.OooOO0O(r20)
            goto L88
        L24:
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
            r1.<init>(r2)
            throw r1
        L2c:
            o00O0.o000OOo.OooOO0O(r20)
            java.lang.Object r3 = r0.L$0
            o00O0o.o000oOoO r3 = (o00O0o.o000oOoO) r3
            androidx.collection.MutableScatterMap<K, V> r6 = r0.this$0
            long[] r6 = r6.metadata
            int r7 = r6.length
            int r7 = r7 + (-2)
            if (r7 < 0) goto L95
            r8 = r4
        L3d:
            r9 = r6[r8]
            long r11 = ~r9
            r13 = 7
            long r11 = r11 << r13
            long r11 = r11 & r9
            r13 = -9187201950435737472(0x8080808080808080, double:-2.937446524422997E-306)
            long r11 = r11 & r13
            int r11 = (r11 > r13 ? 1 : (r11 == r13 ? 0 : -1))
            if (r11 == 0) goto L91
            int r11 = r8 - r7
            int r11 = ~r11
            int r11 = r11 >>> 31
            int r11 = 8 - r11
            r12 = r11
            r11 = r6
            r6 = r12
            r12 = r3
            r3 = r4
            r17 = r9
            r10 = r7
            r9 = r8
            r7 = r17
        L5f:
            if (r3 >= r6) goto L8b
            r13 = 255(0xff, double:1.26E-321)
            long r13 = r13 & r7
            r15 = 128(0x80, double:6.3E-322)
            int r13 = (r13 > r15 ? 1 : (r13 == r15 ? 0 : -1))
            if (r13 >= 0) goto L88
            int r4 = r9 << 3
            int r4 = r4 + r3
            java.lang.Integer r5 = new java.lang.Integer
            r5.<init>(r4)
            r0.L$0 = r12
            r0.L$1 = r11
            r0.I$0 = r10
            r0.I$1 = r9
            r0.J$0 = r7
            r0.I$2 = r6
            r0.I$3 = r3
            r0.label = r1
            r12.OooO00o(r5, r0)
            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
            return r2
        L88:
            long r7 = r7 >> r5
            int r3 = r3 + r1
            goto L5f
        L8b:
            if (r6 != r5) goto L95
            r8 = r9
            r7 = r10
            r6 = r11
            r3 = r12
        L91:
            if (r8 == r7) goto L95
            int r8 = r8 + r1
            goto L3d
        L95:
            oo00o.OooOo r1 = oo00o.OooOo.f33195OooO00o
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.collection.C0156x9ca97416.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000oOoO o000oooo2, OooO0OO oooO0OO) {
        return ((C0156x9ca97416) create(o000oooo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
