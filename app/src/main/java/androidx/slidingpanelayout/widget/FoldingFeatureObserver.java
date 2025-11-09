package androidx.slidingpanelayout.widget;

import android.app.Activity;
import androidx.slidingpanelayout.widget.FoldingFeatureObserver;
import androidx.window.layout.DisplayFeature;
import androidx.window.layout.FoldingFeature;
import androidx.window.layout.WindowInfoTracker;
import androidx.window.layout.WindowLayoutInfo;
import java.util.Iterator;
import java.util.concurrent.Executor;
import o00O0.o000OOo;
import o00O0O0O.OooO0OO;
import o00O0O0o.OooOo00;
import o00O0OO0.OooO;
import o00O0OO0.OooOOOO;
import o00O0Oo.o00O0O;
import o00O0oOo.o0000OO0;
import o00O0oOo.o000OO;
import o00O0oOo.o00O0O00;
import o00O0ooo.o0O000Oo;
import o00O0ooo.o0OoOoOo;
import o00O0ooo.o0o0000;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class FoldingFeatureObserver {
    private final Executor executor;
    private o00O0O00 job;
    private OnFoldingFeatureChangeListener onFoldingFeatureChangeListener;
    private final WindowInfoTracker windowInfoTracker;

    public interface OnFoldingFeatureChangeListener {
        void onFoldingFeatureChange(FoldingFeature foldingFeature);
    }

    @OooO(m13471c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1", m13472f = "FoldingFeatureObserver.kt", m13473l = {97}, m13474m = "invokeSuspend")
    /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1 */
    public static final class C07201 extends OooOOOO implements o00O0O {
        final /* synthetic */ Activity $activity;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C07201(Activity activity, OooO0OO oooO0OO) {
            super(2, oooO0OO);
            this.$activity = activity;
        }

        @Override // o00O0OO0.OooO00o
        public final OooO0OO create(Object obj, OooO0OO oooO0OO) {
            return FoldingFeatureObserver.this.new C07201(this.$activity, oooO0OO);
        }

        @Override // o00O0OO0.OooO00o
        public final Object invokeSuspend(Object obj) {
            OooOo00 oooOo00 = OooOo00.f31365OooOo0O;
            int i = this.label;
            if (i == 0) {
                o000OOo.OooOO0O(obj);
                final o0OoOoOo o0ooooooWindowLayoutInfo = FoldingFeatureObserver.this.windowInfoTracker.windowLayoutInfo(this.$activity);
                final FoldingFeatureObserver foldingFeatureObserver = FoldingFeatureObserver.this;
                o0OoOoOo o0ooooooOooOO0 = o0o0000.OooOO0(new o0OoOoOo() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1

                    /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2, reason: invalid class name */
                    public static final class AnonymousClass2 implements o0O000Oo {
                        final /* synthetic */ o0O000Oo $this_unsafeFlow$inlined;
                        final /* synthetic */ FoldingFeatureObserver this$0;

                        @OooO(m13471c = "androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2", m13472f = "FoldingFeatureObserver.kt", m13473l = {138}, m13474m = "emit")
                        /* renamed from: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1, reason: invalid class name */
                        public static final class AnonymousClass1 extends o00O0OO0.OooO0OO {
                            Object L$0;
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

                        public AnonymousClass2(o0O000Oo o0o000oo, FoldingFeatureObserver foldingFeatureObserver) {
                            this.$this_unsafeFlow$inlined = o0o000oo;
                            this.this$0 = foldingFeatureObserver;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // o00O0ooo.o0O000Oo
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct code enable 'Show inconsistent code' option in preferences
                        */
                        public java.lang.Object emit(java.lang.Object r5, o00O0O0O.OooO0OO r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof androidx.slidingpanelayout.widget.C0719x48a494f1.AnonymousClass2.AnonymousClass1
                                if (r0 == 0) goto L13
                                r0 = r6
                                androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = (androidx.slidingpanelayout.widget.C0719x48a494f1.AnonymousClass2.AnonymousClass1) r0
                                int r1 = r0.label
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.label = r1
                                goto L18
                            L13:
                                androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1 r0 = new androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$mapNotNull$1$2$1
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.result
                                o00O0O0o.OooOo00 r1 = o00O0O0o.OooOo00.f31365OooOo0O
                                int r2 = r0.label
                                r3 = 1
                                if (r2 == 0) goto L2f
                                if (r2 != r3) goto L27
                                o00O0.o000OOo.OooOO0O(r6)
                                goto L48
                            L27:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L2f:
                                o00O0.o000OOo.OooOO0O(r6)
                                o00O0ooo.o0O000Oo r6 = r4.$this_unsafeFlow$inlined
                                androidx.window.layout.WindowLayoutInfo r5 = (androidx.window.layout.WindowLayoutInfo) r5
                                androidx.slidingpanelayout.widget.FoldingFeatureObserver r2 = r4.this$0
                                androidx.window.layout.FoldingFeature r5 = androidx.slidingpanelayout.widget.FoldingFeatureObserver.access$getFoldingFeature(r2, r5)
                                if (r5 != 0) goto L3f
                                goto L48
                            L3f:
                                r0.label = r3
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L48
                                return r1
                            L48:
                                oo00o.OooOo r5 = oo00o.OooOo.f33195OooO00o
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: androidx.slidingpanelayout.widget.C0719x48a494f1.AnonymousClass2.emit(java.lang.Object, o00O0O0O.OooO0OO):java.lang.Object");
                        }
                    }

                    @Override // o00O0ooo.o0OoOoOo
                    public Object collect(o0O000Oo o0o000oo, OooO0OO oooO0OO) {
                        Object objCollect = o0ooooooWindowLayoutInfo.collect(new AnonymousClass2(o0o000oo, foldingFeatureObserver), oooO0OO);
                        return objCollect == OooOo00.f31365OooOo0O ? objCollect : OooOo.f33195OooO00o;
                    }
                });
                final FoldingFeatureObserver foldingFeatureObserver2 = FoldingFeatureObserver.this;
                o0O000Oo o0o000oo = new o0O000Oo() { // from class: androidx.slidingpanelayout.widget.FoldingFeatureObserver$registerLayoutStateChangeCallback$1$invokeSuspend$$inlined$collect$1
                    @Override // o00O0ooo.o0O000Oo
                    public Object emit(FoldingFeature foldingFeature, OooO0OO oooO0OO) {
                        OooOo oooOo;
                        FoldingFeature foldingFeature2 = foldingFeature;
                        FoldingFeatureObserver.OnFoldingFeatureChangeListener onFoldingFeatureChangeListener = foldingFeatureObserver2.onFoldingFeatureChangeListener;
                        OooOo oooOo2 = OooOo.f33195OooO00o;
                        if (onFoldingFeatureChangeListener == null) {
                            oooOo = null;
                        } else {
                            onFoldingFeatureChangeListener.onFoldingFeatureChange(foldingFeature2);
                            oooOo = oooOo2;
                        }
                        return oooOo == OooOo00.f31365OooOo0O ? oooOo : oooOo2;
                    }
                };
                this.label = 1;
                if (o0ooooooOooOO0.collect(o0o000oo, this) == oooOo00) {
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
            return ((C07201) create(o000oo2, oooO0OO)).invokeSuspend(OooOo.f33195OooO00o);
        }
    }

    public FoldingFeatureObserver(WindowInfoTracker windowInfoTracker, Executor executor) {
        kotlin.jvm.internal.OooOo.OooO0o0(windowInfoTracker, "windowInfoTracker");
        kotlin.jvm.internal.OooOo.OooO0o0(executor, "executor");
        this.windowInfoTracker = windowInfoTracker;
        this.executor = executor;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FoldingFeature getFoldingFeature(WindowLayoutInfo windowLayoutInfo) {
        Object next;
        Iterator<T> it = windowLayoutInfo.getDisplayFeatures().iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((DisplayFeature) next) instanceof FoldingFeature) {
                break;
            }
        }
        if (next instanceof FoldingFeature) {
            return (FoldingFeature) next;
        }
        return null;
    }

    public final void registerLayoutStateChangeCallback(Activity activity) {
        kotlin.jvm.internal.OooOo.OooO0o0(activity, "activity");
        o00O0O00 o00o0o00 = this.job;
        if (o00o0o00 != null) {
            o00o0o00.OooO00o(null);
        }
        this.job = o0000OO0.OooOo0(o0000OO0.OooO0O0(o0000OO0.OooOOO(this.executor)), null, new C07201(activity, null), 3);
    }

    public final void setOnFoldingFeatureChangeListener(OnFoldingFeatureChangeListener onFoldingFeatureChangeListener) {
        kotlin.jvm.internal.OooOo.OooO0o0(onFoldingFeatureChangeListener, "onFoldingFeatureChangeListener");
        this.onFoldingFeatureChangeListener = onFoldingFeatureChangeListener;
    }

    public final void unregisterLayoutStateChangeCallback() {
        o00O0O00 o00o0o00 = this.job;
        if (o00o0o00 == null) {
            return;
        }
        o00o0o00.OooO00o(null);
    }
}
