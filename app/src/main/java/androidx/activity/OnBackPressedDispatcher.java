package androidx.activity;

import android.os.Build;
import android.window.BackEvent;
import android.window.OnBackAnimationCallback;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.activity.OnBackPressedDispatcher;
import androidx.core.util.Consumer;
import androidx.lifecycle.Lifecycle;
import androidx.lifecycle.LifecycleEventObserver;
import androidx.lifecycle.LifecycleOwner;
import java.util.Iterator;
import java.util.ListIterator;
import kotlin.jvm.internal.OooOo00;
import kotlin.jvm.internal.Oooo000;
import o00O0.OooOOO0;
import oo00o.OooOo;

/* loaded from: classes.dex */
public final class OnBackPressedDispatcher {
    private boolean backInvokedCallbackRegistered;
    private final Runnable fallbackOnBackPressed;
    private boolean hasEnabledCallbacks;
    private OnBackPressedCallback inProgressCallback;
    private OnBackInvokedDispatcher invokedDispatcher;
    private OnBackInvokedCallback onBackInvokedCallback;
    private final OooOOO0 onBackPressedCallbacks;
    private final Consumer<Boolean> onHasEnabledCallbacksChanged;

    /* renamed from: androidx.activity.OnBackPressedDispatcher$1 */
    public static final class C00161 extends Oooo000 implements o00O0Oo.Oooo000 {
        public C00161() {
            super(1);
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BackEventCompat) obj);
            return OooOo.f33195OooO00o;
        }

        public final void invoke(BackEventCompat backEvent) {
            kotlin.jvm.internal.OooOo.OooO0o0(backEvent, "backEvent");
            OnBackPressedDispatcher.this.onBackStarted(backEvent);
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$2 */
    public static final class C00172 extends Oooo000 implements o00O0Oo.Oooo000 {
        public C00172() {
            super(1);
        }

        @Override // o00O0Oo.Oooo000
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            invoke((BackEventCompat) obj);
            return OooOo.f33195OooO00o;
        }

        public final void invoke(BackEventCompat backEvent) {
            kotlin.jvm.internal.OooOo.OooO0o0(backEvent, "backEvent");
            OnBackPressedDispatcher.this.onBackProgressed(backEvent);
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$3 */
    public static final class C00183 extends Oooo000 implements o00O0Oo.OooO0O0 {
        public C00183() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13476invoke();
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke */
        public final void m13476invoke() {
            OnBackPressedDispatcher.this.onBackPressed();
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$4 */
    public static final class C00194 extends Oooo000 implements o00O0Oo.OooO0O0 {
        public C00194() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13477invoke();
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke */
        public final void m13477invoke() {
            OnBackPressedDispatcher.this.onBackCancelled();
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$5 */
    public static final class C00205 extends Oooo000 implements o00O0Oo.OooO0O0 {
        public C00205() {
            super(0);
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13478invoke();
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke */
        public final void m13478invoke() {
            OnBackPressedDispatcher.this.onBackPressed();
        }
    }

    public static final class Api33Impl {
        public static final Api33Impl INSTANCE = new Api33Impl();

        private Api33Impl() {
        }

        public static final void createOnBackInvokedCallback$lambda$0(o00O0Oo.OooO0O0 onBackInvoked) {
            kotlin.jvm.internal.OooOo.OooO0o0(onBackInvoked, "$onBackInvoked");
            onBackInvoked.invoke();
        }

        public final OnBackInvokedCallback createOnBackInvokedCallback(final o00O0Oo.OooO0O0 onBackInvoked) {
            kotlin.jvm.internal.OooOo.OooO0o0(onBackInvoked, "onBackInvoked");
            return new OnBackInvokedCallback() { // from class: androidx.activity.OooO
                public final void onBackInvoked() {
                    OnBackPressedDispatcher.Api33Impl.createOnBackInvokedCallback$lambda$0(onBackInvoked);
                }
            };
        }

        public final void registerOnBackInvokedCallback(Object dispatcher, int i, Object callback) {
            kotlin.jvm.internal.OooOo.OooO0o0(dispatcher, "dispatcher");
            kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).registerOnBackInvokedCallback(i, (OnBackInvokedCallback) callback);
        }

        public final void unregisterOnBackInvokedCallback(Object dispatcher, Object callback) {
            kotlin.jvm.internal.OooOo.OooO0o0(dispatcher, "dispatcher");
            kotlin.jvm.internal.OooOo.OooO0o0(callback, "callback");
            ((OnBackInvokedDispatcher) dispatcher).unregisterOnBackInvokedCallback((OnBackInvokedCallback) callback);
        }
    }

    public static final class Api34Impl {
        public static final Api34Impl INSTANCE = new Api34Impl();

        private Api34Impl() {
        }

        public final OnBackInvokedCallback createOnBackAnimationCallback(final o00O0Oo.Oooo000 onBackStarted, final o00O0Oo.Oooo000 onBackProgressed, final o00O0Oo.OooO0O0 onBackInvoked, final o00O0Oo.OooO0O0 onBackCancelled) {
            kotlin.jvm.internal.OooOo.OooO0o0(onBackStarted, "onBackStarted");
            kotlin.jvm.internal.OooOo.OooO0o0(onBackProgressed, "onBackProgressed");
            kotlin.jvm.internal.OooOo.OooO0o0(onBackInvoked, "onBackInvoked");
            kotlin.jvm.internal.OooOo.OooO0o0(onBackCancelled, "onBackCancelled");
            return new OnBackAnimationCallback() { // from class: androidx.activity.OnBackPressedDispatcher$Api34Impl$createOnBackAnimationCallback$1
                public void onBackCancelled() {
                    onBackCancelled.invoke();
                }

                public void onBackInvoked() {
                    onBackInvoked.invoke();
                }

                public void onBackProgressed(BackEvent backEvent) {
                    kotlin.jvm.internal.OooOo.OooO0o0(backEvent, "backEvent");
                    onBackProgressed.invoke(new BackEventCompat(backEvent));
                }

                public void onBackStarted(BackEvent backEvent) {
                    kotlin.jvm.internal.OooOo.OooO0o0(backEvent, "backEvent");
                    onBackStarted.invoke(new BackEventCompat(backEvent));
                }
            };
        }
    }

    public final class LifecycleOnBackPressedCancellable implements LifecycleEventObserver, Cancellable {
        private Cancellable currentCancellable;
        private final Lifecycle lifecycle;
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public LifecycleOnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, Lifecycle lifecycle, OnBackPressedCallback onBackPressedCallback) {
            kotlin.jvm.internal.OooOo.OooO0o0(lifecycle, "lifecycle");
            kotlin.jvm.internal.OooOo.OooO0o0(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.lifecycle = lifecycle;
            this.onBackPressedCallback = onBackPressedCallback;
            lifecycle.addObserver(this);
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.lifecycle.removeObserver(this);
            this.onBackPressedCallback.removeCancellable(this);
            Cancellable cancellable = this.currentCancellable;
            if (cancellable != null) {
                cancellable.cancel();
            }
            this.currentCancellable = null;
        }

        @Override // androidx.lifecycle.LifecycleEventObserver
        public void onStateChanged(LifecycleOwner source, Lifecycle.Event event) {
            kotlin.jvm.internal.OooOo.OooO0o0(source, "source");
            kotlin.jvm.internal.OooOo.OooO0o0(event, "event");
            if (event == Lifecycle.Event.ON_START) {
                this.currentCancellable = this.this$0.addCancellableCallback$activity_release(this.onBackPressedCallback);
                return;
            }
            if (event != Lifecycle.Event.ON_STOP) {
                if (event == Lifecycle.Event.ON_DESTROY) {
                    cancel();
                }
            } else {
                Cancellable cancellable = this.currentCancellable;
                if (cancellable != null) {
                    cancellable.cancel();
                }
            }
        }
    }

    public final class OnBackPressedCancellable implements Cancellable {
        private final OnBackPressedCallback onBackPressedCallback;
        final /* synthetic */ OnBackPressedDispatcher this$0;

        public OnBackPressedCancellable(OnBackPressedDispatcher onBackPressedDispatcher, OnBackPressedCallback onBackPressedCallback) {
            kotlin.jvm.internal.OooOo.OooO0o0(onBackPressedCallback, "onBackPressedCallback");
            this.this$0 = onBackPressedDispatcher;
            this.onBackPressedCallback = onBackPressedCallback;
        }

        @Override // androidx.activity.Cancellable
        public void cancel() {
            this.this$0.onBackPressedCallbacks.remove(this.onBackPressedCallback);
            if (kotlin.jvm.internal.OooOo.OooO00o(this.this$0.inProgressCallback, this.onBackPressedCallback)) {
                this.onBackPressedCallback.handleOnBackCancelled();
                this.this$0.inProgressCallback = null;
            }
            this.onBackPressedCallback.removeCancellable(this);
            o00O0Oo.OooO0O0 enabledChangedCallback$activity_release = this.onBackPressedCallback.getEnabledChangedCallback$activity_release();
            if (enabledChangedCallback$activity_release != null) {
                enabledChangedCallback$activity_release.invoke();
            }
            this.onBackPressedCallback.setEnabledChangedCallback$activity_release(null);
        }
    }

    /* renamed from: androidx.activity.OnBackPressedDispatcher$addCallback$1 */
    public /* synthetic */ class C00221 extends OooOo00 implements o00O0Oo.OooO0O0 {
        public C00221(Object obj) {
            super(0, obj, OnBackPressedDispatcher.class, "updateEnabledCallbacks", "updateEnabledCallbacks()V", 0);
        }

        @Override // o00O0Oo.OooO0O0
        public /* bridge */ /* synthetic */ Object invoke() {
            m13479invoke();
            return OooOo.f33195OooO00o;
        }

        /* renamed from: invoke */
        public final void m13479invoke() {
            ((OnBackPressedDispatcher) this.receiver).updateEnabledCallbacks();
        }
    }

    public OnBackPressedDispatcher() {
        this(null, 1, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void onBackCancelled() {
        OnBackPressedCallback onBackPressedCallbackPrevious;
        OnBackPressedCallback onBackPressedCallback = this.inProgressCallback;
        if (onBackPressedCallback == null) {
            OooOOO0 oooOOO0 = this.onBackPressedCallbacks;
            ListIterator listIterator = oooOOO0.listIterator(oooOOO0.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallbackPrevious = 0;
                    break;
                } else {
                    onBackPressedCallbackPrevious = listIterator.previous();
                    if (((OnBackPressedCallback) onBackPressedCallbackPrevious).isEnabled()) {
                        break;
                    }
                }
            }
            onBackPressedCallback = onBackPressedCallbackPrevious;
        }
        this.inProgressCallback = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackCancelled();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2 */
    /* JADX WARN: Type inference failed for: r1v3 */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object] */
    public final void onBackProgressed(BackEventCompat backEventCompat) {
        OnBackPressedCallback onBackPressedCallbackPrevious;
        OnBackPressedCallback onBackPressedCallback = this.inProgressCallback;
        if (onBackPressedCallback == null) {
            OooOOO0 oooOOO0 = this.onBackPressedCallbacks;
            ListIterator listIterator = oooOOO0.listIterator(oooOOO0.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallbackPrevious = 0;
                    break;
                } else {
                    onBackPressedCallbackPrevious = listIterator.previous();
                    if (((OnBackPressedCallback) onBackPressedCallbackPrevious).isEnabled()) {
                        break;
                    }
                }
            }
            onBackPressedCallback = onBackPressedCallbackPrevious;
        }
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackProgressed(backEventCompat);
        }
    }

    public final void onBackStarted(BackEventCompat backEventCompat) {
        Object objPrevious;
        OooOOO0 oooOOO0 = this.onBackPressedCallbacks;
        ListIterator<E> listIterator = oooOOO0.listIterator(oooOOO0.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                objPrevious = null;
                break;
            } else {
                objPrevious = listIterator.previous();
                if (((OnBackPressedCallback) objPrevious).isEnabled()) {
                    break;
                }
            }
        }
        OnBackPressedCallback onBackPressedCallback = (OnBackPressedCallback) objPrevious;
        this.inProgressCallback = onBackPressedCallback;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackStarted(backEventCompat);
        }
    }

    private final void updateBackInvokedCallbackState(boolean z) {
        OnBackInvokedDispatcher onBackInvokedDispatcher = this.invokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback = this.onBackInvokedCallback;
        if (onBackInvokedDispatcher == null || onBackInvokedCallback == null) {
            return;
        }
        if (z && !this.backInvokedCallbackRegistered) {
            Api33Impl.INSTANCE.registerOnBackInvokedCallback(onBackInvokedDispatcher, 0, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = true;
        } else {
            if (z || !this.backInvokedCallbackRegistered) {
                return;
            }
            Api33Impl.INSTANCE.unregisterOnBackInvokedCallback(onBackInvokedDispatcher, onBackInvokedCallback);
            this.backInvokedCallbackRegistered = false;
        }
    }

    public final void updateEnabledCallbacks() {
        boolean z = this.hasEnabledCallbacks;
        OooOOO0 oooOOO0 = this.onBackPressedCallbacks;
        boolean z2 = false;
        if (oooOOO0 == null || !oooOOO0.isEmpty()) {
            Iterator it = oooOOO0.iterator();
            while (true) {
                if (!it.hasNext()) {
                    break;
                } else if (((OnBackPressedCallback) it.next()).isEnabled()) {
                    z2 = true;
                    break;
                }
            }
        }
        this.hasEnabledCallbacks = z2;
        if (z2 != z) {
            Consumer<Boolean> consumer = this.onHasEnabledCallbacksChanged;
            if (consumer != null) {
                consumer.accept(Boolean.valueOf(z2));
            }
            if (Build.VERSION.SDK_INT >= 33) {
                updateBackInvokedCallbackState(z2);
            }
        }
    }

    public final void addCallback(OnBackPressedCallback onBackPressedCallback) {
        kotlin.jvm.internal.OooOo.OooO0o0(onBackPressedCallback, "onBackPressedCallback");
        addCancellableCallback$activity_release(onBackPressedCallback);
    }

    public final Cancellable addCancellableCallback$activity_release(OnBackPressedCallback onBackPressedCallback) {
        kotlin.jvm.internal.OooOo.OooO0o0(onBackPressedCallback, "onBackPressedCallback");
        this.onBackPressedCallbacks.addLast(onBackPressedCallback);
        OnBackPressedCancellable onBackPressedCancellable = new OnBackPressedCancellable(this, onBackPressedCallback);
        onBackPressedCallback.addCancellable(onBackPressedCancellable);
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new OnBackPressedDispatcher$addCancellableCallback$1(this));
        return onBackPressedCancellable;
    }

    public final void dispatchOnBackCancelled() {
        onBackCancelled();
    }

    public final void dispatchOnBackProgressed(BackEventCompat backEvent) {
        kotlin.jvm.internal.OooOo.OooO0o0(backEvent, "backEvent");
        onBackProgressed(backEvent);
    }

    public final void dispatchOnBackStarted(BackEventCompat backEvent) {
        kotlin.jvm.internal.OooOo.OooO0o0(backEvent, "backEvent");
        onBackStarted(backEvent);
    }

    public final boolean hasEnabledCallbacks() {
        return this.hasEnabledCallbacks;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v4, types: [java.lang.Object] */
    public final void onBackPressed() {
        OnBackPressedCallback onBackPressedCallbackPrevious;
        OnBackPressedCallback onBackPressedCallback = this.inProgressCallback;
        if (onBackPressedCallback == null) {
            OooOOO0 oooOOO0 = this.onBackPressedCallbacks;
            ListIterator listIterator = oooOOO0.listIterator(oooOOO0.size());
            while (true) {
                if (!listIterator.hasPrevious()) {
                    onBackPressedCallbackPrevious = 0;
                    break;
                } else {
                    onBackPressedCallbackPrevious = listIterator.previous();
                    if (((OnBackPressedCallback) onBackPressedCallbackPrevious).isEnabled()) {
                        break;
                    }
                }
            }
            onBackPressedCallback = onBackPressedCallbackPrevious;
        }
        this.inProgressCallback = null;
        if (onBackPressedCallback != null) {
            onBackPressedCallback.handleOnBackPressed();
            return;
        }
        Runnable runnable = this.fallbackOnBackPressed;
        if (runnable != null) {
            runnable.run();
        }
    }

    public final void setOnBackInvokedDispatcher(OnBackInvokedDispatcher invoker) {
        kotlin.jvm.internal.OooOo.OooO0o0(invoker, "invoker");
        this.invokedDispatcher = invoker;
        updateBackInvokedCallbackState(this.hasEnabledCallbacks);
    }

    public OnBackPressedDispatcher(Runnable runnable, Consumer<Boolean> consumer) {
        this.fallbackOnBackPressed = runnable;
        this.onHasEnabledCallbacksChanged = consumer;
        this.onBackPressedCallbacks = new OooOOO0();
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            this.onBackInvokedCallback = i >= 34 ? Api34Impl.INSTANCE.createOnBackAnimationCallback(new C00161(), new C00172(), new C00183(), new C00194()) : Api33Impl.INSTANCE.createOnBackInvokedCallback(new C00205());
        }
    }

    public final void addCallback(LifecycleOwner owner, OnBackPressedCallback onBackPressedCallback) {
        kotlin.jvm.internal.OooOo.OooO0o0(owner, "owner");
        kotlin.jvm.internal.OooOo.OooO0o0(onBackPressedCallback, "onBackPressedCallback");
        Lifecycle lifecycle = owner.getLifecycle();
        if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
            return;
        }
        onBackPressedCallback.addCancellable(new LifecycleOnBackPressedCancellable(this, lifecycle, onBackPressedCallback));
        updateEnabledCallbacks();
        onBackPressedCallback.setEnabledChangedCallback$activity_release(new C00221(this));
    }

    public /* synthetic */ OnBackPressedDispatcher(Runnable runnable, int i, kotlin.jvm.internal.OooOO0O oooOO0O) {
        this((i & 1) != 0 ? null : runnable);
    }

    public OnBackPressedDispatcher(Runnable runnable) {
        this(runnable, null);
    }
}
