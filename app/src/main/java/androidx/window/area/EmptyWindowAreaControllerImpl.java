package androidx.window.area;

import android.app.Activity;
import android.os.Binder;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.OooOo;
import o00O.o0OoOo0;
import o00O0.oo000o;
import o00O0ooo.o0OoOoOo;

/* loaded from: classes.dex */
public final class EmptyWindowAreaControllerImpl implements WindowAreaController {
    @Override // androidx.window.area.WindowAreaController
    public o0OoOoOo getWindowAreaInfos() {
        return new o0OoOo0(oo000o.f31251OooOo0O, 1);
    }

    @Override // androidx.window.area.WindowAreaController
    public void presentContentOnWindowArea(Binder token, Activity activity, Executor executor, WindowAreaPresentationSessionCallback windowAreaPresentationSessionCallback) {
        OooOo.OooO0o0(token, "token");
        OooOo.OooO0o0(activity, "activity");
        OooOo.OooO0o0(executor, "executor");
        OooOo.OooO0o0(windowAreaPresentationSessionCallback, "windowAreaPresentationSessionCallback");
        windowAreaPresentationSessionCallback.onSessionEnded(new IllegalStateException("There are no WindowAreas"));
    }

    @Override // androidx.window.area.WindowAreaController
    public void transferActivityToWindowArea(Binder token, Activity activity, Executor executor, WindowAreaSessionCallback windowAreaSessionCallback) {
        OooOo.OooO0o0(token, "token");
        OooOo.OooO0o0(activity, "activity");
        OooOo.OooO0o0(executor, "executor");
        OooOo.OooO0o0(windowAreaSessionCallback, "windowAreaSessionCallback");
        windowAreaSessionCallback.onSessionEnded(new IllegalStateException("There are no WindowAreas"));
    }
}
