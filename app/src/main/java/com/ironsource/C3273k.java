package com.ironsource;

import android.app.Activity;
import android.os.Build;
import android.view.Window;
import android.view.WindowInsets;
import android.view.WindowInsetsController;
import java.lang.ref.WeakReference;

/* renamed from: com.ironsource.k */
/* loaded from: classes2.dex */
public class C3273k implements InterfaceC2988bx {

    /* renamed from: a */
    private WeakReference<Activity> f9189a;

    public C3273k(Activity activity) {
        this.f9189a = new WeakReference<>(activity);
    }

    @Override // com.ironsource.InterfaceC2988bx
    /* renamed from: a */
    public void mo8057a() {
        Activity activity = this.f9189a.get();
        if (activity == null) {
            return;
        }
        int i = Build.VERSION.SDK_INT;
        Window window = activity.getWindow();
        if (i < 30) {
            window.setFlags(1024, 1024);
            return;
        }
        WindowInsetsController windowInsetsController = window.getDecorView().getWindowInsetsController();
        if (windowInsetsController != null) {
            windowInsetsController.hide(WindowInsets.Type.statusBars());
        }
    }
}
