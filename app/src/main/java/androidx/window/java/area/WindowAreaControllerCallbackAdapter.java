package androidx.window.java.area;

import android.app.Activity;
import android.os.Binder;
import androidx.core.util.Consumer;
import androidx.window.area.WindowAreaController;
import androidx.window.area.WindowAreaInfo;
import androidx.window.area.WindowAreaPresentationSessionCallback;
import androidx.window.area.WindowAreaSessionCallback;
import androidx.window.java.core.CallbackToFlowAdapter;
import java.util.List;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.OooOo;
import o00O0ooo.o0OoOoOo;

/* loaded from: classes.dex */
public final class WindowAreaControllerCallbackAdapter implements WindowAreaController {
    private final CallbackToFlowAdapter callbackToFlowAdapter;
    private final WindowAreaController controller;

    private WindowAreaControllerCallbackAdapter(WindowAreaController windowAreaController, CallbackToFlowAdapter callbackToFlowAdapter) {
        this.controller = windowAreaController;
        this.callbackToFlowAdapter = callbackToFlowAdapter;
    }

    public final void addWindowAreaInfoListListener(Executor executor, Consumer<List<WindowAreaInfo>> listener) {
        OooOo.OooO0o0(executor, "executor");
        OooOo.OooO0o0(listener, "listener");
        this.callbackToFlowAdapter.connect(executor, listener, this.controller.getWindowAreaInfos());
    }

    @Override // androidx.window.area.WindowAreaController
    public o0OoOoOo getWindowAreaInfos() {
        return this.controller.getWindowAreaInfos();
    }

    @Override // androidx.window.area.WindowAreaController
    public void presentContentOnWindowArea(Binder token, Activity activity, Executor executor, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback) {
        OooOo.OooO0o0(token, "token");
        OooOo.OooO0o0(activity, "activity");
        OooOo.OooO0o0(executor, "executor");
        OooOo.OooO0o0(windowAreaPresentationSessionCallback, "windowAreaPresentationSessionCallback");
        this.controller.presentContentOnWindowArea(token, activity, executor, windowAreaPresentationSessionCallback);
    }

    public final void removeWindowAreaInfoListListener(Consumer<List<WindowAreaInfo>> listener) {
        OooOo.OooO0o0(listener, "listener");
        this.callbackToFlowAdapter.disconnect(listener);
    }

    @Override // androidx.window.area.WindowAreaController
    public void transferActivityToWindowArea(Binder token, Activity activity, Executor executor, WindowAreaSessionCallback windowAreaSessionCallback) {
        OooOo.OooO0o0(token, "token");
        OooOo.OooO0o0(activity, "activity");
        OooOo.OooO0o0(executor, "executor");
        OooOo.OooO0o0(windowAreaSessionCallback, "windowAreaSessionCallback");
        this.controller.transferActivityToWindowArea(token, activity, executor, windowAreaSessionCallback);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public WindowAreaControllerCallbackAdapter(WindowAreaController controller) {
        this(controller, new CallbackToFlowAdapter());
        OooOo.OooO0o0(controller, "controller");
    }
}
