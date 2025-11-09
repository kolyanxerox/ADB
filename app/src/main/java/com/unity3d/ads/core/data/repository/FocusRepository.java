package com.unity3d.ads.core.data.repository;

import com.unity3d.ads.core.domain.AndroidGetLifecycleFlow;
import com.unity3d.services.core.log.DeviceLog;
import java.lang.reflect.InvocationTargetException;
import kotlin.jvm.internal.OooOo;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooO0OO;
import o00O0oOo.o0000O00;
import o00O0oOo.o0000OO0;
import o00O0oo.o0000oo;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0OOO0OO;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;

/* loaded from: classes3.dex */
public final class FocusRepository {
    private final o0OOO0OO focusState;

    public FocusRepository(AndroidGetLifecycleFlow getLifecycleFlow, o0000O00 defaultDispatcher) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        o0OOO0OO o0ooo0ooOooO00o;
        OooOo.OooO0o0(getLifecycleFlow, "getLifecycleFlow");
        OooOo.OooO0o0(defaultDispatcher, "defaultDispatcher");
        try {
            final o0OoOoOo o0ooooooInvoke = getLifecycleFlow.invoke();
            final o0OoOoOo o0oooooo = new o0OoOoOo() { // from class: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1

                /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2 */
                public static final class C40532<T> implements o0O000Oo {
                    final /* synthetic */ o0O000Oo $this_unsafeFlow;

                    @OooO(m13471c = "com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2", m13472f = "FocusRepository.kt", m13473l = {223}, m13474m = "emit")
                    /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends OooO0OO {
                        Object L$0;
                        Object L$1;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(o00O0O0O.OooO0OO oooO0OO) {
                            super(oooO0OO);
                        }

                        @Override // o00O0OO0.OooO00o
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C40532.this.emit(null, this);
                        }
                    }

                    public C40532(o0O000Oo o0o000oo) {
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
                            boolean r0 = r7 instanceof com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1.C40532.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r7
                            com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2$1 r0 = (com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1.C40532.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2$1 r0 = new com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1$2$1
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
                            com.unity3d.ads.core.domain.LifecycleEvent r2 = (com.unity3d.ads.core.domain.LifecycleEvent) r2
                            boolean r4 = r2 instanceof com.unity3d.ads.core.domain.LifecycleEvent.Paused
                            if (r4 != 0) goto L3f
                            boolean r2 = r2 instanceof com.unity3d.ads.core.domain.LifecycleEvent.Resumed
                            if (r2 == 0) goto L48
                        L3f:
                            r0.label = r3
                            java.lang.Object r6 = r7.emit(r6, r0)
                            if (r6 != r1) goto L48
                            return r1
                        L48:
                            oo00o.OooOo r6 = oo00o.OooOo.f33195OooO00o
                            return r6
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$filter$1.C40532.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                    }
                }

                @Override // o00O0ooo.o0OoOoOo
                public Object collect(o0O000Oo o0o000oo, o00O0O0O.OooO0OO oooO0OO) {
                    Object objCollect = o0ooooooInvoke.collect(new C40532(o0o000oo), oooO0OO);
                    return objCollect == OooOo00.f31365OooOo0O ? objCollect : oo00o.OooOo.f33195OooO00o;
                }
            };
            o0ooo0ooOooO00o = o0o0000.OooOOo(new o0OoOoOo() { // from class: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1

                /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2 */
                public static final class C40542<T> implements o0O000Oo {
                    final /* synthetic */ o0O000Oo $this_unsafeFlow;

                    @OooO(m13471c = "com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2", m13472f = "FocusRepository.kt", m13473l = {223}, m13474m = "emit")
                    /* renamed from: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2$1, reason: invalid class name */
                    public static final class AnonymousClass1 extends OooO0OO {
                        Object L$0;
                        int label;
                        /* synthetic */ Object result;

                        public AnonymousClass1(o00O0O0O.OooO0OO oooO0OO) {
                            super(oooO0OO);
                        }

                        @Override // o00O0OO0.OooO00o
                        public final Object invokeSuspend(Object obj) {
                            this.result = obj;
                            this.label |= Integer.MIN_VALUE;
                            return C40542.this.emit(null, this);
                        }
                    }

                    public C40542(o0O000Oo o0o000oo) {
                        this.$this_unsafeFlow = o0o000oo;
                    }

                    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                    @Override // o00O0ooo.o0O000Oo
                    /*
                        Code decompiled incorrectly, please refer to instructions dump.
                        To view partially-correct code enable 'Show inconsistent code' option in preferences
                    */
                    public final java.lang.Object emit(java.lang.Object r5, o00O0O0O.OooO0OO r6) {
                        /*
                            r4 = this;
                            boolean r0 = r6 instanceof com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1.C40542.AnonymousClass1
                            if (r0 == 0) goto L13
                            r0 = r6
                            com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2$1 r0 = (com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1.C40542.AnonymousClass1) r0
                            int r1 = r0.label
                            r2 = -2147483648(0xffffffff80000000, float:-0.0)
                            r3 = r1 & r2
                            if (r3 == 0) goto L13
                            int r1 = r1 - r2
                            r0.label = r1
                            goto L18
                        L13:
                            com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2$1 r0 = new com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1$2$1
                            r0.<init>(r6)
                        L18:
                            java.lang.Object r6 = r0.result
                            o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                            int r2 = r0.label
                            r3 = 1
                            if (r2 == 0) goto L2f
                            if (r2 != r3) goto L27
                            o00O0.o000OOo.OooOO0O(r6)
                            goto L56
                        L27:
                            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                            r5.<init>(r6)
                            throw r5
                        L2f:
                            o00O0.o000OOo.OooOO0O(r6)
                            o00O0ooo.o0O000Oo r6 = r4.$this_unsafeFlow
                            com.unity3d.ads.core.domain.LifecycleEvent r5 = (com.unity3d.ads.core.domain.LifecycleEvent) r5
                            boolean r2 = r5 instanceof com.unity3d.ads.core.domain.LifecycleEvent.Resumed
                            if (r2 == 0) goto L44
                            com.unity3d.ads.core.data.repository.FocusState$Focused r2 = new com.unity3d.ads.core.data.repository.FocusState$Focused
                            java.lang.ref.WeakReference r5 = r5.getActivity()
                            r2.<init>(r5)
                            goto L4d
                        L44:
                            com.unity3d.ads.core.data.repository.FocusState$Unfocused r2 = new com.unity3d.ads.core.data.repository.FocusState$Unfocused
                            java.lang.ref.WeakReference r5 = r5.getActivity()
                            r2.<init>(r5)
                        L4d:
                            r0.label = r3
                            java.lang.Object r5 = r6.emit(r2, r0)
                            if (r5 != r1) goto L56
                            return r1
                        L56:
                            oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
                            return r5
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.unity3d.ads.core.data.repository.FocusRepository$special$$inlined$map$1.C40542.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                    }
                }

                @Override // o00O0ooo.o0OoOoOo
                public Object collect(o0O000Oo o0o000oo, o00O0O0O.OooO0OO oooO0OO) {
                    Object objCollect = o0oooooo.collect(new C40542(o0o000oo), oooO0OO);
                    return objCollect == OooOo00.f31365OooOo0O ? objCollect : oo00o.OooOo.f33195OooO00o;
                }
            }, o0000OO0.OooO0O0(defaultDispatcher), 1);
        } catch (Exception e) {
            DeviceLog.error("Could not subscribe to lifecycle flow", e);
            o0ooo0ooOooO00o = o0o0000.OooO00o((7 & 1) != 0 ? 0 : 100, (7 & 2) == 0 ? 64 : 0, o0000oo.f31602OooOo0O);
        }
        this.focusState = o0ooo0ooOooO00o;
    }

    public final o0OOO0OO getFocusState() {
        return this.focusState;
    }
}
