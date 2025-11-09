package androidx.window.area;

import android.content.Context;
import android.view.View;

/* loaded from: classes.dex */
public interface WindowAreaSessionPresenter extends WindowAreaSession {
    Context getContext();

    void setContentView(View view);
}
