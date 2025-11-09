package androidx.lifecycle;

import kotlin.jvm.internal.OooOo;
import o00O0Oo.Oooo000;

/* loaded from: classes.dex */
public final class LiveDataKt {
    public static final <T> Observer<T> observe(LiveData<T> liveData, LifecycleOwner owner, final Oooo000 onChanged) {
        OooOo.OooO0o0(liveData, "<this>");
        OooOo.OooO0o0(owner, "owner");
        OooOo.OooO0o0(onChanged, "onChanged");
        Observer<T> observer = new Observer() { // from class: androidx.lifecycle.LiveDataKt$observe$wrappedObserver$1
            @Override // androidx.lifecycle.Observer
            public final void onChanged(T t) {
                onChanged.invoke(t);
            }
        };
        liveData.observe(owner, observer);
        return observer;
    }
}
