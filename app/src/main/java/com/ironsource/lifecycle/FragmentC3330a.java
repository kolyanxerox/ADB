package com.ironsource.lifecycle;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.os.Bundle;

/* renamed from: com.ironsource.lifecycle.a */
/* loaded from: classes2.dex */
public class FragmentC3330a extends Fragment {

    /* renamed from: b */
    private static final String f9372b = "com.ironsource.lifecycle.IronsourceLifecycleFragment";

    /* renamed from: a */
    private a f9373a;

    /* renamed from: com.ironsource.lifecycle.a$a */
    public interface a {
        /* renamed from: a */
        void mo9795a(Activity activity);

        /* renamed from: b */
        void mo9796b(Activity activity);

        void onResume(Activity activity);
    }

    /* renamed from: a */
    public static FragmentC3330a m9789a(Activity activity) {
        return (FragmentC3330a) activity.getFragmentManager().findFragmentByTag(f9372b);
    }

    /* renamed from: b */
    public static void m9791b(Activity activity) {
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager == null || fragmentManager.findFragmentByTag(f9372b) != null) {
            return;
        }
        fragmentManager.beginTransaction().add(new FragmentC3330a(), f9372b).commit();
        fragmentManager.executePendingTransactions();
    }

    /* renamed from: c */
    private void m9793c(a aVar) {
        if (aVar != null) {
            aVar.mo9795a(getActivity());
        }
    }

    /* renamed from: d */
    public void m9794d(a aVar) {
        this.f9373a = aVar;
    }

    @Override // android.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        m9790a(this.f9373a);
    }

    @Override // android.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.f9373a = null;
    }

    @Override // android.app.Fragment
    public void onPause() {
        super.onPause();
    }

    @Override // android.app.Fragment
    public void onResume() {
        super.onResume();
        m9792b(this.f9373a);
    }

    @Override // android.app.Fragment
    public void onStart() {
        super.onStart();
        m9793c(this.f9373a);
    }

    @Override // android.app.Fragment
    public void onStop() {
        super.onStop();
    }

    /* renamed from: a */
    private void m9790a(a aVar) {
        if (aVar != null) {
            aVar.mo9796b(getActivity());
        }
    }

    /* renamed from: b */
    private void m9792b(a aVar) {
        if (aVar != null) {
            aVar.onResume(getActivity());
        }
    }
}
