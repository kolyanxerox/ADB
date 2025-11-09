package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.data.model.AdObjectState;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import o00O0ooo.oO00000o;
import oo00o.OooOo;

@OooO(m13471c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1", m13472f = "CleanUpWhenOpportunityExpires.kt", m13473l = {33, 34, 39}, m13474m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class CleanUpWhenOpportunityExpires$invoke$job$1 extends OooOOOO implements o00O0O {
    final /* synthetic */ AdObject $adObject;
    int label;

    @OooO(m13471c = "com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1", m13472f = "CleanUpWhenOpportunityExpires.kt", m13473l = {41}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1 */
    public static final class C40921 extends OooOOOO implements o00O0O {
        final /* synthetic */ AdObject $adObject;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C40921(AdObject adObject, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$adObject = adObject;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return new C40921(this.$adObject, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                ((oO00000o) this.$adObject.getState()).OooO0oo(AdObjectState.EXPIRED);
                AdPlayer adPlayer = this.$adObject.getAdPlayer();
                this.label = 1;
                if (adPlayer.destroy(this) == oooOo00) {
                    return oooOo00;
                }
            } else {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
            }
            return OooOo.f33195OooO00o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C40921) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CleanUpWhenOpportunityExpires$invoke$job$1(AdObject adObject, OooO0OO oooO0OO) {
        super(2, oooO0OO);
        this.$adObject = adObject;
    }

    @Override // o00O0OO0.OooO00o
    public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
        return new CleanUpWhenOpportunityExpires$invoke$job$1(this.$adObject, oooO0OO);
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x004d, code lost:
    
        if (r8 == r0) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0075  */
    @Override // o00O0OO0.OooO00o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r8) {
        /*
            r7 = this;
            o00O0O0o.OooOo00 r0 = o00O0O0o.OooOo00.f31365OooOo0O
            int r1 = r7.label
            oo00o.OooOo r2 = oo00o.OooOo.f33195OooO00o
            r3 = 3
            r4 = 2
            r5 = 1
            if (r1 == 0) goto L25
            if (r1 == r5) goto L21
            if (r1 == r4) goto L1d
            if (r1 != r3) goto L15
            o00O0.o000OOo.OooOO0O(r8)
            return r2
        L15:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L1d:
            o00O0.o000OOo.OooOO0O(r8)
            goto L65
        L21:
            o00O0.o000OOo.OooOO0O(r8)
            goto L50
        L25:
            o00O0.o000OOo.OooOO0O(r8)
            com.unity3d.ads.core.data.model.AdObject r8 = r7.$adObject
            o00O0ooo.o0OO r8 = r8.getTtl()
            o00O0ooo.oO00000o r8 = (o00O0ooo.oO00000o) r8
            java.lang.Object r8 = r8.getValue()
            o00O0oOO.OooOO0O r8 = (o00O0oOO.OooOO0O) r8
            if (r8 == 0) goto L3b
            long r5 = r8.f31463OooOo0O
            goto L54
        L3b:
            com.unity3d.ads.core.data.model.AdObject r8 = r7.$adObject
            o00O0ooo.o0OO r8 = r8.getTtl()
            o00O.o0OoOo0 r1 = new o00O.o0OoOo0
            r6 = 3
            r1.<init>(r8, r6)
            r7.label = r5
            java.lang.Object r8 = o00O0ooo.o0o0000.OooOO0o(r1, r7)
            if (r8 != r0) goto L50
            goto L87
        L50:
            o00O0oOO.OooOO0O r8 = (o00O0oOO.OooOO0O) r8
            long r5 = r8.f31463OooOo0O
        L54:
            r7.label = r4
            long r4 = o00O0oOo.o0000OO0.OooOooO(r5)
            java.lang.Object r8 = o00O0oOo.o0000OO0.OooOO0O(r4, r7)
            if (r8 != r0) goto L61
            goto L62
        L61:
            r8 = r2
        L62:
            if (r8 != r0) goto L65
            goto L87
        L65:
            com.unity3d.ads.core.data.model.AdObject r8 = r7.$adObject
            o00O0ooo.o0OO r8 = r8.getState()
            o00O0ooo.oO00000o r8 = (o00O0ooo.oO00000o) r8
            java.lang.Object r8 = r8.getValue()
            com.unity3d.ads.core.data.model.AdObjectState r1 = com.unity3d.ads.core.data.model.AdObjectState.SHOWING
            if (r8 == r1) goto L88
            o00O0oOo.o00OO0O0 r8 = o00O0oOo.o00OO0O0.f31546OooOo0O
            com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1 r1 = new com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1$1
            com.unity3d.ads.core.data.model.AdObject r4 = r7.$adObject
            r5 = 0
            r1.<init>(r4, r5)
            r7.label = r3
            java.lang.Object r8 = o00O0oOo.o0000OO0.Oooo00O(r1, r8, r7)
            if (r8 != r0) goto L88
        L87:
            return r0
        L88:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.CleanUpWhenOpportunityExpires$invoke$job$1.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    @Override // o00O0Oo.o00O0O
    public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
        return ((CleanUpWhenOpportunityExpires$invoke$job$1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
    }
}
