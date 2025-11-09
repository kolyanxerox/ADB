package com.google.android.gms.common.api.internal;

import Oooo00O.o000000O;
import android.app.Activity;
import android.content.ContextWrapper;
import android.content.Intent;
import android.os.Bundle;
import androidx.annotation.MainThread;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentActivity;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;

/* loaded from: classes2.dex */
public abstract class OooOO0 {

    @NonNull
    protected final OooOO0O mLifecycleFragment;

    public OooOO0(OooOO0O oooOO0O) {
        this.mLifecycleFragment = oooOO0O;
    }

    @NonNull
    public static OooOO0O getFragment(@NonNull Activity activity) {
        return getFragment(new OooO(activity));
    }

    @MainThread
    public void dump(@NonNull String str, @Nullable FileDescriptor fileDescriptor, @NonNull PrintWriter printWriter, @Nullable String[] strArr) {
    }

    @NonNull
    public Activity getActivity() {
        Activity activityOooO0OO = this.mLifecycleFragment.OooO0OO();
        o000000O.OooO0oo(activityOooO0OO);
        return activityOooO0OO;
    }

    @MainThread
    public void onActivityResult(int i, int i2, @Nullable Intent intent) {
    }

    @MainThread
    public void onCreate(@Nullable Bundle bundle) {
    }

    @MainThread
    public void onDestroy() {
    }

    @MainThread
    public void onResume() {
    }

    @MainThread
    public void onSaveInstanceState(@NonNull Bundle bundle) {
    }

    @MainThread
    public void onStart() {
    }

    public abstract void onStop();

    @NonNull
    public static OooOO0O getFragment(@NonNull OooO oooO) {
        o0OO00O o0oo00o;
        oo0o0Oo oo0o0oo;
        Activity activity = oooO.f16684OooO00o;
        if (activity instanceof FragmentActivity) {
            FragmentActivity fragmentActivity = (FragmentActivity) activity;
            WeakHashMap weakHashMap = oo0o0Oo.f16764OooOo0o;
            WeakReference weakReference = (WeakReference) weakHashMap.get(fragmentActivity);
            if (weakReference != null && (oo0o0oo = (oo0o0Oo) weakReference.get()) != null) {
                return oo0o0oo;
            }
            try {
                oo0o0Oo oo0o0oo2 = (oo0o0Oo) fragmentActivity.getSupportFragmentManager().findFragmentByTag("SLifecycleFragmentImpl");
                if (oo0o0oo2 == null || oo0o0oo2.isRemoving()) {
                    oo0o0oo2 = new oo0o0Oo();
                    fragmentActivity.getSupportFragmentManager().beginTransaction().add(oo0o0oo2, "SLifecycleFragmentImpl").commitAllowingStateLoss();
                }
                weakHashMap.put(fragmentActivity, new WeakReference(oo0o0oo2));
                return oo0o0oo2;
            } catch (ClassCastException e) {
                throw new IllegalStateException("Fragment with tag SLifecycleFragmentImpl is not a SupportLifecycleFragmentImpl", e);
            }
        }
        if (activity == null) {
            throw new IllegalArgumentException("Can't get fragment for unexpected activity.");
        }
        WeakHashMap weakHashMap2 = o0OO00O.f16740OooOo0o;
        WeakReference weakReference2 = (WeakReference) weakHashMap2.get(activity);
        if (weakReference2 != null && (o0oo00o = (o0OO00O) weakReference2.get()) != null) {
            return o0oo00o;
        }
        try {
            o0OO00O o0oo00o2 = (o0OO00O) activity.getFragmentManager().findFragmentByTag("LifecycleFragmentImpl");
            if (o0oo00o2 == null || o0oo00o2.isRemoving()) {
                o0oo00o2 = new o0OO00O();
                activity.getFragmentManager().beginTransaction().add(o0oo00o2, "LifecycleFragmentImpl").commitAllowingStateLoss();
            }
            weakHashMap2.put(activity, new WeakReference(o0oo00o2));
            return o0oo00o2;
        } catch (ClassCastException e2) {
            throw new IllegalStateException("Fragment with tag LifecycleFragmentImpl is not a LifecycleFragmentImpl", e2);
        }
    }

    @NonNull
    public static OooOO0O getFragment(@NonNull ContextWrapper contextWrapper) {
        throw new UnsupportedOperationException();
    }
}
