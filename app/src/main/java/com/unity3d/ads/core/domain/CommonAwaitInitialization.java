package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.data.repository.SessionRepository;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class CommonAwaitInitialization implements AwaitInitialization {
    private final SessionRepository sessionRepository;

    @OooO(m13471c = "com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2", m13472f = "CommonAwaitInitialization.kt", m13473l = {15}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2 */
    public static final class C40942 extends OooOOOO implements o00O0O {
        int label;

        public C40942(OooO0OO oooO0OO) {
            super(2, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return CommonAwaitInitialization.this.new C40942(oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                o000OOo.OooOO0O(obj);
                return obj;
            }
            o000OOo.OooOO0O(obj);
            final o0OoOoOo observeInitializationState = CommonAwaitInitialization.this.sessionRepository.getObserveInitializationState();
            o0OoOoOo o0oooooo = new o0OoOoOo() { // from class: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1

                /* renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                public static final class AnonymousClass2<T> implements o0O000Oo {
                    final /* synthetic */ o0O000Oo $this_unsafeFlow;

                    @OooO(m13471c = "com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2", m13472f = "CommonAwaitInitialization.kt", m13473l = {223}, m13474m = "emit")
                    /* renamed from: com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends o00O0OO0.OooO0OO {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(OooO0OO oooO0OO) {
                            super(oooO0OO);
                        }

                        @Override // o00O0OO0.OooO00o
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return AnonymousClass2.this.emit(null, this);
                        }
                    }

                    public AnonymousClass2(o0O000Oo o0o000oo) {
                        this.$this_unsafeFlow = o0o000oo;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // o00O0ooo.o0O000Oo
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r6, o00O0O0O.OooO0OO r7) {
                        /*
                            r5 = this;
                            boolean r0 = r7 instanceof com.unity3d.ads.core.domain.C4093x9a59111d.AnonymousClass2.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.domain.C4093x9a59111d.AnonymousClass2.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.domain.CommonAwaitInitialization$invoke$2$invokeSuspend$$inlined$filter$1$2$1
                            r0.<init>(r7)
                        L18:
                            java.lang.Object r7 = r0.result
                            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            o00O0.o000OOo.OooOO0O(r7)
                            goto L48
                        L27:
                            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                            r6.<init>(r7)
                            throw r6
                        L2f:
                            o00O0.o000OOo.OooOO0O(r7)
                            o00O0ooo.o0O000Oo r7 = r5.$this_unsafeFlow
                            r2 = r6
                            com.unity3d.ads.core.data.model.InitializationState r2 = (com.unity3d.ads.core.data.model.InitializationState) r2
                            com.unity3d.ads.core.data.model.InitializationState r4 = com.unity3d.ads.core.data.model.InitializationState.INITIALIZED
                            if (r2 == r4) goto L3f
                            com.unity3d.ads.core.data.model.InitializationState r4 = com.unity3d.ads.core.data.model.InitializationState.FAILED
                            if (r2 != r4) goto L48
                        L3f:
                            r0.label = r3
                            java.lang.Object r6 = r7.emit(r6, r0)
                            if (r6 != r1) goto L48
                            return r1
                        L48:
                            oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.domain.C4093x9a59111d.AnonymousClass2.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                    }
                }

                @Override // o00O0ooo.o0OoOoOo
                public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                    Object objCollect = observeInitializationState.collect(new AnonymousClass2(o0o000oo), oooO0OO);
                    return objCollect == OooOo00.f31365OooOo0O ? objCollect : OooOo.f33195OooO00o;
                }
            };
            this.label = 1;
            Object objOooOO0o = o0o0000.OooOO0o(o0oooooo, this);
            return objOooOO0o == oooOo00 ? oooOo00 : objOooOO0o;
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
            return ((C40942) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public CommonAwaitInitialization(SessionRepository sessionRepository) {
        kotlin.jvm.internal.OooOo.OooO0o0(sessionRepository, "sessionRepository");
        this.sessionRepository = sessionRepository;
    }

    @Override // com.unity3d.ads.core.domain.AwaitInitialization
    public Object invoke(long j, OooO0OO oooO0OO) {
        return o0000OO0.Oooo00o(j, new C40942(null), oooO0OO);
    }
}
