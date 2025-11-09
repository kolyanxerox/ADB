package com.unity3d.ads.core.extensions;

import kotlin.jvm.internal.OooO00o;
import o00O.OooOOO0;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0O.OooOOO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.OooO0O0;
import o00O0Oo.o00O0O;
import o00O0oOo.o000OO;
import o00O0oo.o0000oo;
import o00O0oo.o00oOoo;
import o00O0oo.o0O0ooO;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0OoOoOo;
import oo00o.OooOo;

/* loaded from: classes3.dex */
public final class FlowExtensionsKt {

    @OooO(m13471c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1", m13472f = "FlowExtensions.kt", m13473l = {15, 17}, m13474m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1 */
    public static final class C41901 extends OooOOOO implements o00O0O {
        final /* synthetic */ boolean $active;
        final /* synthetic */ o00O0O $block;
        final /* synthetic */ o0OoOoOo $this_timeoutAfter;
        final /* synthetic */ long $timeoutMillis;
        private /* synthetic */ Object L$0;
        int label;

        @OooO(m13471c = "com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1", m13472f = "FlowExtensions.kt", m13473l = {10}, m13474m = "invokeSuspend")
        /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1 */
        public static final class AnonymousClass1 extends OooOOOO implements o00O0O {
            final /* synthetic */ o00oOoo $$this$channelFlow;
            final /* synthetic */ o0OoOoOo $this_timeoutAfter;
            int label;

            /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1$1 */
            public static final class C45911<T> implements o0O000Oo {
                public C45911() {
                }

                @Override // o00O0ooo.o0O000Oo
                public final Object emit(T t, OooO0OO oooO0OO) {
                    Object objOooOOO0 = ((o0O0ooO) o00oooo).f31651OooOoO0.OooOOO0(t, oooO0OO);
                    return objOooOOO0 == OooOo00.f31365OooOo0O ? objOooOOO0 : OooOo.f33195OooO00o;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public AnonymousClass1(o0OoOoOo o0oooooo, o00oOoo o00oooo, OooO0OO oooO0OO) {
                super(2, oooO0OO);
                this.$this_timeoutAfter = o0oooooo;
                this.$$this$channelFlow = o00oooo;
            }

            @Override // o00O0OO0.OooO00o
            public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
                return new AnonymousClass1(this.$this_timeoutAfter, this.$$this$channelFlow, oooO0OO);
            }

            @Override // o00O0OO0.OooO00o
            public final Object invokeSuspend(Object obj) {
                OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
                int i = this.label;
                if (i == 0) {
                    o000OOo.OooOO0O(obj);
                    o0OoOoOo o0oooooo = this.$this_timeoutAfter;
                    C45911 c45911 = new o0O000Oo() { // from class: com.unity3d.ads.core.extensions.FlowExtensionsKt.timeoutAfter.1.1.1
                        public C45911() {
                        }

                        @Override // o00O0ooo.o0O000Oo
                        public final Object emit(T t, OooO0OO oooO0OO) {
                            Object objOooOOO0 = ((o0O0ooO) o00oooo).f31651OooOoO0.OooOOO0(t, oooO0OO);
                            return objOooOOO0 == OooOo00.f31365OooOo0O ? objOooOOO0 : OooOo.f33195OooO00o;
                        }
                    };
                    this.label = 1;
                    if (o0oooooo.collect(c45911, this) == oooOo00) {
                        return oooOo00;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    o000OOo.OooOO0O(obj);
                }
                ((o0O0ooO) this.$$this$channelFlow).OooOOO(null);
                return OooOo.f33195OooO00o;
            }

            @Override // o00O0Oo.o00O0O
            public final Object invoke(o000OO o000oo2, OooO0OO oooO0OO) {
                return ((AnonymousClass1) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
            }
        }

        /* renamed from: com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2 */
        public /* synthetic */ class AnonymousClass2 extends OooO00o implements OooO0O0 {
            public AnonymousClass2(Object obj) {
                super(0, obj, o00oOoo.class, "close", "close(Ljava/lang/Throwable;)Z", 8);
            }

            @Override // o00O0Oo.OooO0O0
            public /* bridge */ /* synthetic */ Object invoke() {
                m13780invoke();
                return OooOo.f33195OooO00o;
            }

            /* renamed from: invoke */
            public final void m13780invoke() {
                ((o0O0ooO) ((o00oOoo) this.receiver)).OooOOO(null);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C41901(long j, boolean z, o00O0O o00o0o, o0OoOoOo o0oooooo, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$timeoutMillis = j;
            this.$active = z;
            this.$block = o00o0o;
            this.$this_timeoutAfter = o0oooooo;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            C41901 c41901 = new C41901(this.$timeoutMillis, this.$active, this.$block, this.$this_timeoutAfter, oooO0OO);
            c41901.L$0 = obj;
            return c41901;
        }

        /* JADX WARN: Code restructure failed: missing block: B:36:0x0054, code lost:
        
            if (r8.invoke(r4, r7) == r0) goto L37;
         */
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
                r2 = 0
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L21
                if (r1 == r4) goto L19
                if (r1 != r3) goto L11
                o00O0.o000OOo.OooOO0O(r8)
                goto L57
            L11:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L19:
                java.lang.Object r1 = r7.L$0
                o00O0oo.o00oOoo r1 = (o00O0oo.o00oOoo) r1
                o00O0.o000OOo.OooOO0O(r8)
                goto L41
            L21:
                o00O0.o000OOo.OooOO0O(r8)
                java.lang.Object r8 = r7.L$0
                r1 = r8
                o00O0oo.o00oOoo r1 = (o00O0oo.o00oOoo) r1
                com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1 r8 = new com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$1
                o00O0ooo.o0OoOoOo r5 = r7.$this_timeoutAfter
                r8.<init>(r5, r1, r2)
                r5 = 3
                o00O0oOo.o0000OO0.OooOo0(r1, r2, r8, r5)
                long r5 = r7.$timeoutMillis
                r7.L$0 = r1
                r7.label = r4
                java.lang.Object r8 = o00O0oOo.o0000OO0.OooOO0O(r5, r7)
                if (r8 != r0) goto L41
                goto L56
            L41:
                boolean r8 = r7.$active
                if (r8 == 0) goto L57
                o00O0Oo.o00O0O r8 = r7.$block
                com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2 r4 = new com.unity3d.ads.core.extensions.FlowExtensionsKt$timeoutAfter$1$2
                r4.<init>(r1)
                r7.L$0 = r2
                r7.label = r3
                java.lang.Object r8 = r8.invoke(r4, r7)
                if (r8 != r0) goto L57
            L56:
                return r0
            L57:
                oo00o.OooOo r8 = oo00o.OooOo.f33195OooO00o
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.extensions.FlowExtensionsKt.C41901.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // o00O0Oo.o00O0O
        public final Object invoke(o00oOoo o00oooo, OooO0OO oooO0OO) {
            return ((C41901) create(o00oooo, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public static final <T> o0OoOoOo timeoutAfter(o0OoOoOo o0oooooo, long j, boolean z, o00O0O block) {
        kotlin.jvm.internal.OooOo.OooO0o0(o0oooooo, "<this>");
        kotlin.jvm.internal.OooOo.OooO0o0(block, "block");
        return new OooOOO0(new C41901(j, z, block, o0oooooo, null), OooOOO.f31358OooOo0O, -2, o0000oo.f31602OooOo0O);
    }

    public static /* synthetic */ o0OoOoOo timeoutAfter$default(o0OoOoOo o0oooooo, long j, boolean z, o00O0O o00o0o, int i, Object obj) {
        if ((i & 2) != 0) {
            z = true;
        }
        return timeoutAfter(o0oooooo, j, z, o00o0o);
    }
}
