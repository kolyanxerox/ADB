package androidx.datastore.core;

import o00O0O0O.OooO0OO;
import o00O0Oo.Oooo000;
import o00O0Oo.o00O0O;
import o00O0ooo.o0OoOoOo;

/* loaded from: classes.dex */
public interface InterProcessCoordinator {
    o0OoOoOo getUpdateNotifications();

    Object getVersion(OooO0OO oooO0OO);

    Object incrementAndGetVersion(OooO0OO oooO0OO);

    <T> Object lock(Oooo000 oooo000, OooO0OO oooO0OO);

    <T> Object tryLock(o00O0O o00o0o, OooO0OO oooO0OO);
}
