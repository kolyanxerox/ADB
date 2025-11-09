package androidx.lifecycle;

/* loaded from: classes.dex */
public interface LiveDataScope<T> {
    Object emit(T t, o00O0O0O.OooO0OO oooO0OO);

    Object emitSource(LiveData<T> liveData, o00O0O0O.OooO0OO oooO0OO);

    T getLatestValue();
}
