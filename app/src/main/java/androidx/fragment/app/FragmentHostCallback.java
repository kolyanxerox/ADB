package androidx.fragment.app;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.IntentSender;
import android.os.Bundle;
import android.os.Handler;
import android.view.LayoutInflater;
import android.view.View;
import androidx.core.app.ActivityCompat;
import androidx.core.content.ContextCompat;
import java.io.FileDescriptor;
import java.io.PrintWriter;
import kotlin.jvm.internal.OooOo;

/* loaded from: classes.dex */
public abstract class FragmentHostCallback<H> extends FragmentContainer {
    private final Activity activity;
    private final Context context;
    private final FragmentManager fragmentManager;
    private final Handler handler;
    private final int windowAnimations;

    public FragmentHostCallback(Activity activity, Context context, Handler handler, int i) {
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(handler, "handler");
        this.activity = activity;
        this.context = context;
        this.handler = handler;
        this.windowAnimations = i;
        this.fragmentManager = new FragmentManagerImpl();
    }

    public final Activity getActivity() {
        return this.activity;
    }

    public final Context getContext() {
        return this.context;
    }

    public final FragmentManager getFragmentManager() {
        return this.fragmentManager;
    }

    public final Handler getHandler() {
        return this.handler;
    }

    public void onDump(String prefix, FileDescriptor fileDescriptor, PrintWriter writer, String[] strArr) {
        OooOo.OooO0o0(prefix, "prefix");
        OooOo.OooO0o0(writer, "writer");
    }

    @Override // androidx.fragment.app.FragmentContainer
    public View onFindViewById(int i) {
        return null;
    }

    public abstract H onGetHost();

    public LayoutInflater onGetLayoutInflater() {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.context);
        OooOo.OooO0Oo(layoutInflaterFrom, "from(context)");
        return layoutInflaterFrom;
    }

    public int onGetWindowAnimations() {
        return this.windowAnimations;
    }

    @Override // androidx.fragment.app.FragmentContainer
    public boolean onHasView() {
        return true;
    }

    public boolean onHasWindowAnimations() {
        return true;
    }

    public void onRequestPermissionsFromFragment(Fragment fragment, String[] permissions, int i) {
        OooOo.OooO0o0(fragment, "fragment");
        OooOo.OooO0o0(permissions, "permissions");
    }

    public boolean onShouldSaveFragmentState(Fragment fragment) {
        OooOo.OooO0o0(fragment, "fragment");
        return true;
    }

    public boolean onShouldShowRequestPermissionRationale(String permission) {
        OooOo.OooO0o0(permission, "permission");
        return false;
    }

    public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i) {
        OooOo.OooO0o0(fragment, "fragment");
        OooOo.OooO0o0(intent, "intent");
        onStartActivityFromFragment(fragment, intent, i, null);
    }

    public void onStartIntentSenderFromFragment(Fragment fragment, IntentSender intent, int i, Intent intent2, int i2, int i3, int i4, Bundle bundle) throws IntentSender.SendIntentException {
        OooOo.OooO0o0(fragment, "fragment");
        OooOo.OooO0o0(intent, "intent");
        if (i != -1) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        Activity activity = this.activity;
        if (activity == null) {
            throw new IllegalStateException("Starting intent sender with a requestCode requires a FragmentActivity host");
        }
        ActivityCompat.startIntentSenderForResult(activity, intent, i, intent2, i2, i3, i4, bundle);
    }

    public void onSupportInvalidateOptionsMenu() {
    }

    public void onStartActivityFromFragment(Fragment fragment, Intent intent, int i, Bundle bundle) {
        OooOo.OooO0o0(fragment, "fragment");
        OooOo.OooO0o0(intent, "intent");
        if (i != -1) {
            throw new IllegalStateException("Starting activity with a requestCode requires a FragmentActivity host");
        }
        ContextCompat.startActivity(this.context, intent, bundle);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentHostCallback(Context context, Handler handler, int i) {
        this(context instanceof Activity ? (Activity) context : null, context, handler, i);
        OooOo.OooO0o0(context, "context");
        OooOo.OooO0o0(handler, "handler");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public FragmentHostCallback(FragmentActivity activity) {
        this(activity, activity, new Handler(), 0);
        OooOo.OooO0o0(activity, "activity");
    }
}
