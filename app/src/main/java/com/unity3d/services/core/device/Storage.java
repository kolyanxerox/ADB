package com.unity3d.services.core.device;

import com.unity3d.services.core.device.StorageManager;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.misc.JsonStorage;
import com.unity3d.services.core.misc.Utilities;
import com.unity3d.services.core.webview.WebViewApp;
import com.unity3d.services.core.webview.WebViewEventCategory;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.internal.OooOO0O;
import kotlin.jvm.internal.OooOo;
import o00O0.OooOo00;
import o00O0.oo000o;
import o00O0Oo.Oooo000;
import o00O0oO.o0OO00O;
import o00O0ooo.o0OO;
import o00O0ooo.o0o0000;
import o00O0ooo.oO00000o;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public class Storage extends JsonStorage {
    public static final Companion Companion = new Companion(null);
    private static final o0OO onStorageEventCallbacks = o0o0000.OooO0OO(oo000o.f31251OooOo0O);
    private final String _targetFileName;
    private final StorageManager.StorageType type;

    public static final class Companion {
        public /* synthetic */ Companion(OooOO0O oooOO0O) {
            this();
        }

        public final void addStorageEventCallback(Oooo000 callback) {
            oO00000o oo00000o;
            Object value;
            OooOo.OooO0o0(callback, "callback");
            o0OO o0oo = Storage.onStorageEventCallbacks;
            do {
                oo00000o = (oO00000o) o0oo;
                value = oo00000o.getValue();
            } while (!oo00000o.OooO0oO(value, OooOo00.Oooo00o((List) value, callback)));
        }

        public final void removeStorageEventCallback(Oooo000 callback) {
            oO00000o oo00000o;
            Object value;
            ArrayList arrayList;
            OooOo.OooO0o0(callback, "callback");
            o0OO o0oo = Storage.onStorageEventCallbacks;
            do {
                oo00000o = (oO00000o) o0oo;
                value = oo00000o.getValue();
                List list = (List) value;
                OooOo.OooO0o0(list, "<this>");
                arrayList = new ArrayList(o00O0.Oooo000.OooOo0(list, 10));
                boolean z = false;
                for (Object obj : list) {
                    boolean z2 = true;
                    if (!z && OooOo.OooO00o(obj, callback)) {
                        z = true;
                        z2 = false;
                    }
                    if (z2) {
                        arrayList.add(obj);
                    }
                }
            } while (!oo00000o.OooO0oO(value, arrayList));
        }

        private Companion() {
        }
    }

    public Storage(String _targetFileName, StorageManager.StorageType type) {
        OooOo.OooO0o0(_targetFileName, "_targetFileName");
        OooOo.OooO0o0(type, "type");
        this._targetFileName = _targetFileName;
        this.type = type;
    }

    public synchronized boolean clearStorage() {
        clearData();
        return new File(this._targetFileName).delete();
    }

    public final StorageManager.StorageType getType() {
        return this.type;
    }

    public final synchronized boolean initStorage() {
        readStorage();
        super.initData();
        return true;
    }

    public synchronized boolean readStorage() {
        byte[] fileBytes;
        boolean z = false;
        try {
            try {
                fileBytes = Utilities.readFileBytes(new File(this._targetFileName));
            } catch (Exception e) {
                DeviceLog.debug("Failed to read storage JSON file:", e);
            }
        } catch (FileNotFoundException e2) {
            DeviceLog.debug("Storage JSON file not found in local cache:", e2);
        }
        if (fileBytes == null) {
            return false;
        }
        setData(new JSONObject(new String(fileBytes, o0OO00O.f31451OooO00o)));
        z = true;
        return z;
    }

    public final synchronized void sendEvent(StorageEvent storageEvent, Object obj) {
        List list = (List) ((oO00000o) onStorageEventCallbacks).getValue();
        if (list.isEmpty()) {
            if (!(WebViewApp.getCurrentApp() != null ? WebViewApp.getCurrentApp().sendEvent(WebViewEventCategory.STORAGE, storageEvent, this.type.name(), obj) : false)) {
                DeviceLog.debug("Couldn't send storage event to WebApp");
            }
            return;
        }
        OooOo.OooO0O0(storageEvent);
        StorageEventInfo storageEventInfo = new StorageEventInfo(storageEvent, this.type, obj);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((Oooo000) it.next()).invoke(storageEventInfo);
        }
    }

    public final synchronized boolean storageFileExists() {
        return new File(this._targetFileName).exists();
    }

    public synchronized boolean writeStorage() {
        File file = new File(this._targetFileName);
        if (getData() == null) {
            return false;
        }
        return Utilities.writeFile(file, getData().toString());
    }
}
