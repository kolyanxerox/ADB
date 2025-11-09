package com.unity3d.ads.core.domain.work;

import com.unity3d.ads.core.domain.work.DownloadPriorityQueue;
import java.util.Comparator;
import java.util.PriorityQueue;
import o00O0.o000OOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0ooo.o0OO;
import o00O0ooo.o0o0000;
import o00OO0O0.OooO00o;
import o00OO0O0.OooO0o;
import o00Oo0oo.o00oO0o;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class DownloadPriorityQueue {
    private final OooO00o mutex = new OooO0o(false);
    private final o0OO nextTurn = o0o0000.OooO0OO(null);
    private final PriorityQueue<PriorityItem> queue = new PriorityQueue<>(50, new Comparator() { // from class: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$special$$inlined$compareBy$1
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t, T t2) {
            return o00oO0o.OooO0Oo(Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t).getPriority()), Integer.valueOf(((DownloadPriorityQueue.PriorityItem) t2).getPriority()));
        }
    });

    public static final class PriorityItem {
        private final int priority;

        public PriorityItem(int i) {
            this.priority = i;
        }

        public final int getPriority() {
            return this.priority;
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue", m13472f = "DownloadPriorityQueue.kt", m13473l = {47, 28, 31, 57}, m13474m = "invoke")
    /* renamed from: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$1 */
    public static final class C41871 extends OooO0OO {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        int label;
        /* synthetic */ Object result;

        public C41871(o00O0O0O.OooO0OO oooO0OO) {
            super(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return DownloadPriorityQueue.this.invoke(0, null, this);
        }
    }

    @OooO(m13471c = "com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3", m13472f = "DownloadPriorityQueue.kt", m13473l = {}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.work.DownloadPriorityQueue$invoke$3 */
    public static final class C41883 extends OooOOOO implements o00O0O {
        final /* synthetic */ PriorityItem $priorityItem;
        /* synthetic */ Object L$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41883(PriorityItem priorityItem, o00O0O0O.OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$priorityItem = priorityItem;
        }

        @Override // o00O0OO0.OooO00o
        public final o00O0O0O.OooO0OO create(Object obj, o00O0O0O.OooO0OO oooO0OO) {
            C41883 c41883 = new C41883(this.$priorityItem, oooO0OO);
            c41883.L$0 = obj;
            return c41883;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(PriorityItem priorityItem, o00O0O0O.OooO0OO oooO0OO) {
            return ((C41883) create(priorityItem, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            o000OOo.OooOO0O(obj);
            return Boolean.valueOf(((PriorityItem) this.L$0) == this.$priorityItem);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0052 A[PHI: r2 r11
  0x0052: PHI (r2v6 com.unity3d.ads.core.domain.work.DownloadPriorityQueue) = 
  (r2v5 com.unity3d.ads.core.domain.work.DownloadPriorityQueue)
  (r2v11 com.unity3d.ads.core.domain.work.DownloadPriorityQueue)
 binds: [B:31:0x00db, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]
  0x0052: PHI (r11v7 com.unity3d.ads.core.domain.work.DownloadPriorityQueue$PriorityItem) = 
  (r11v6 com.unity3d.ads.core.domain.work.DownloadPriorityQueue$PriorityItem)
  (r11v20 com.unity3d.ads.core.domain.work.DownloadPriorityQueue$PriorityItem)
 binds: [B:31:0x00db, B:17:0x0046] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00f1  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invoke(int r11, o00O0Oo.Oooo000 r12, o00O0O0O.OooO0OO r13) {
        /*
            Method dump skipped, instructions count: 282
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.work.DownloadPriorityQueue.invoke(int, o00O0Oo.Oooo000, o00O0O0O.OooO0OO):java.lang.Object");
    }
}
