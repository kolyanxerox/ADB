package com.unity3d.services.core.cache;

import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import androidx.datastore.preferences.protobuf.OooO00o;
import com.unity3d.services.core.api.Request;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.request.IWebRequestProgressListener;
import com.unity3d.services.core.request.NetworkIOException;
import com.unity3d.services.core.request.WebRequest;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.net.MalformedURLException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes3.dex */
class CacheThreadHandler extends Handler {
    private WebRequest _currentRequest = null;
    private boolean _canceled = false;
    private boolean _active = false;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [java.io.FileOutputStream] */
    /* JADX WARN: Type inference failed for: r3v26 */
    /* JADX WARN: Type inference failed for: r3v3 */
    /* JADX WARN: Type inference failed for: r3v57 */
    private void downloadFile(String str, String str2, int i, int i2, final int i3, HashMap<String, List<String>> map, boolean z, final CacheEventSender cacheEventSender) throws Throwable {
        Object obj;
        Throwable th;
        ?? r3;
        FileOutputStream fileOutputStream;
        FileOutputStream fileOutputStream2;
        FileOutputStream fileOutputStream3;
        FileOutputStream fileOutputStream4;
        FileOutputStream fileOutputStream5;
        FileOutputStream fileOutputStream6;
        FileOutputStream fileOutputStream7;
        long jMakeStreamRequest;
        if (this._canceled || str == null || str2 == null) {
            return;
        }
        final File file = new File(str2);
        Object obj2 = " to ";
        if (z) {
            StringBuilder sbOooOOo0 = OooO00o.OooOOo0("Unity Ads cache: resuming download ", str, " to ", str2, " at ");
            sbOooOOo0.append(file.length());
            sbOooOOo0.append(" bytes");
            DeviceLog.debug(sbOooOOo0.toString());
            obj = " bytes";
        } else {
            DeviceLog.debug("Unity Ads cache: start downloading " + str + " to " + str2);
            obj = obj2;
        }
        if (!Device.isActiveNetworkConnected()) {
            DeviceLog.debug("Unity Ads cache: download cancelled, no internet connection available");
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.NO_INTERNET, str);
            return;
        }
        this._active = true;
        long jElapsedRealtime = SystemClock.elapsedRealtime();
        WebRequest webRequest = null;
        try {
            try {
                FileOutputStream fileOutputStream8 = new FileOutputStream(file, z);
                try {
                    WebRequest webRequest2 = getWebRequest(str, i, i2, map);
                    this._currentRequest = webRequest2;
                    webRequest2.setProgressListener(new IWebRequestProgressListener() { // from class: com.unity3d.services.core.cache.CacheThreadHandler.1
                        private long lastProgressEventTime = System.currentTimeMillis();

                        @Override // com.unity3d.services.core.request.IWebRequestProgressListener
                        public void onRequestProgress(String str3, long j, long j2) {
                            if (i3 <= 0 || System.currentTimeMillis() - this.lastProgressEventTime <= i3) {
                                return;
                            }
                            this.lastProgressEventTime = System.currentTimeMillis();
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_PROGRESS, str3, Long.valueOf(j), Long.valueOf(j2));
                        }

                        @Override // com.unity3d.services.core.request.IWebRequestProgressListener
                        public void onRequestStart(String str3, long j, int i4, Map<String, List<String>> map2) {
                            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_STARTED, str3, Long.valueOf(file.length()), Long.valueOf(file.length() + j), Integer.valueOf(i4), Request.getResponseHeadersMap(map2));
                        }
                    });
                    jMakeStreamRequest = this._currentRequest.makeStreamRequest(fileOutputStream8);
                    this._active = false;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (NetworkIOException e) {
                    e = e;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (FileNotFoundException e2) {
                    e = e2;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (IllegalStateException e3) {
                    e = e3;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (MalformedURLException e4) {
                    e = e4;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (IOException e5) {
                    e = e5;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (Exception e6) {
                    e = e6;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                } catch (Throwable th2) {
                    th = th2;
                    fileOutputStream7 = fileOutputStream8;
                    webRequest = null;
                }
            } catch (NetworkIOException e7) {
                e = e7;
                webRequest = null;
                fileOutputStream6 = null;
            } catch (FileNotFoundException e8) {
                e = e8;
                webRequest = null;
                fileOutputStream5 = null;
            } catch (IOException e9) {
                e = e9;
                webRequest = null;
                fileOutputStream4 = null;
            } catch (IllegalStateException e10) {
                e = e10;
                webRequest = null;
                fileOutputStream3 = null;
            } catch (MalformedURLException e11) {
                e = e11;
                webRequest = null;
                fileOutputStream2 = null;
            } catch (Exception e12) {
                e = e12;
                webRequest = null;
                fileOutputStream = null;
            } catch (Throwable th3) {
                webRequest = null;
                th = th3;
                r3 = 0;
            }
            try {
                postProcessDownload(jElapsedRealtime, str, file, jMakeStreamRequest, this._currentRequest.getContentLength(), this._currentRequest.isCanceled(), this._currentRequest.getResponseCode(), this._currentRequest.getResponseHeaders(), cacheEventSender);
                this._currentRequest = null;
                try {
                    fileOutputStream7.close();
                } catch (Exception e13) {
                    DeviceLog.exception("Error closing stream", e13);
                    cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e13.getMessage());
                }
            } catch (NetworkIOException e14) {
                e = e14;
                fileOutputStream6 = fileOutputStream7;
                DeviceLog.exception("Network error", e);
                this._active = false;
                cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.NETWORK_ERROR, str, e.getMessage());
                this._currentRequest = webRequest;
                obj = fileOutputStream6;
                if (fileOutputStream6 != null) {
                    try {
                        fileOutputStream6.close();
                        obj = fileOutputStream6;
                    } catch (Exception e15) {
                        DeviceLog.exception("Error closing stream", e15);
                        CacheEvent cacheEvent = CacheEvent.DOWNLOAD_ERROR;
                        Object obj3 = CacheError.FILE_IO_ERROR;
                        cacheEventSender.sendEvent(cacheEvent, obj3, str, e15.getMessage());
                        obj = obj3;
                    }
                }
            } catch (FileNotFoundException e16) {
                e = e16;
                fileOutputStream5 = fileOutputStream7;
                DeviceLog.exception("Couldn't create target file", e);
                this._active = false;
                cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e.getMessage());
                this._currentRequest = webRequest;
                obj = fileOutputStream5;
                if (fileOutputStream5 != null) {
                    try {
                        fileOutputStream5.close();
                        obj = fileOutputStream5;
                    } catch (Exception e17) {
                        DeviceLog.exception("Error closing stream", e17);
                        CacheEvent cacheEvent2 = CacheEvent.DOWNLOAD_ERROR;
                        Object obj4 = CacheError.FILE_IO_ERROR;
                        cacheEventSender.sendEvent(cacheEvent2, obj4, str, e17.getMessage());
                        obj = obj4;
                    }
                }
            } catch (IllegalStateException e18) {
                e = e18;
                fileOutputStream3 = fileOutputStream7;
                DeviceLog.exception("Illegal state", e);
                this._active = false;
                cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.ILLEGAL_STATE, str, e.getMessage());
                this._currentRequest = webRequest;
                obj = fileOutputStream3;
                if (fileOutputStream3 != null) {
                    try {
                        fileOutputStream3.close();
                        obj = fileOutputStream3;
                    } catch (Exception e19) {
                        DeviceLog.exception("Error closing stream", e19);
                        CacheEvent cacheEvent3 = CacheEvent.DOWNLOAD_ERROR;
                        Object obj5 = CacheError.FILE_IO_ERROR;
                        cacheEventSender.sendEvent(cacheEvent3, obj5, str, e19.getMessage());
                        obj = obj5;
                    }
                }
            } catch (MalformedURLException e20) {
                e = e20;
                fileOutputStream2 = fileOutputStream7;
                DeviceLog.exception("Malformed URL", e);
                this._active = false;
                cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.MALFORMED_URL, str, e.getMessage());
                this._currentRequest = webRequest;
                obj = fileOutputStream2;
                if (fileOutputStream2 != null) {
                    try {
                        fileOutputStream2.close();
                        obj = fileOutputStream2;
                    } catch (Exception e21) {
                        DeviceLog.exception("Error closing stream", e21);
                        CacheEvent cacheEvent4 = CacheEvent.DOWNLOAD_ERROR;
                        Object obj6 = CacheError.FILE_IO_ERROR;
                        cacheEventSender.sendEvent(cacheEvent4, obj6, str, e21.getMessage());
                        obj = obj6;
                    }
                }
            } catch (IOException e22) {
                e = e22;
                fileOutputStream4 = fileOutputStream7;
                DeviceLog.exception("Couldn't request stream", e);
                this._active = false;
                cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e.getMessage());
                this._currentRequest = webRequest;
                obj = fileOutputStream4;
                if (fileOutputStream4 != null) {
                    try {
                        fileOutputStream4.close();
                        obj = fileOutputStream4;
                    } catch (Exception e23) {
                        DeviceLog.exception("Error closing stream", e23);
                        CacheEvent cacheEvent5 = CacheEvent.DOWNLOAD_ERROR;
                        Object obj7 = CacheError.FILE_IO_ERROR;
                        cacheEventSender.sendEvent(cacheEvent5, obj7, str, e23.getMessage());
                        obj = obj7;
                    }
                }
            } catch (Exception e24) {
                e = e24;
                fileOutputStream = fileOutputStream7;
                DeviceLog.exception("Unknown error", e);
                this._active = false;
                cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.UNKNOWN_ERROR, str, e.getMessage());
                this._currentRequest = webRequest;
                obj = fileOutputStream;
                if (fileOutputStream != null) {
                    try {
                        fileOutputStream.close();
                        obj = fileOutputStream;
                    } catch (Exception e25) {
                        DeviceLog.exception("Error closing stream", e25);
                        CacheEvent cacheEvent6 = CacheEvent.DOWNLOAD_ERROR;
                        Object obj8 = CacheError.FILE_IO_ERROR;
                        cacheEventSender.sendEvent(cacheEvent6, obj8, str, e25.getMessage());
                        obj = obj8;
                    }
                }
            } catch (Throwable th4) {
                th = th4;
                th = th;
                r3 = fileOutputStream7;
                this._currentRequest = webRequest;
                if (r3 == 0) {
                    throw th;
                }
                try {
                    r3.close();
                    throw th;
                } catch (Exception e26) {
                    DeviceLog.exception("Error closing stream", e26);
                    cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_IO_ERROR, str, e26.getMessage());
                    throw th;
                }
            }
        } catch (Throwable th5) {
            th = th5;
            r3 = obj;
        }
    }

    private WebRequest getWebRequest(String str, int i, int i2, HashMap<String, List<String>> map) throws MalformedURLException {
        HashMap map2 = new HashMap();
        if (map != null) {
            map2.putAll(map);
        }
        return new WebRequest(str, "GET", map2, i, i2);
    }

    private void postProcessDownload(long j, String str, File file, long j2, long j3, boolean z, int i, Map<String, List<String>> map, CacheEventSender cacheEventSender) throws IllegalAccessException, NoSuchMethodException, SecurityException, IllegalArgumentException, InvocationTargetException {
        long jElapsedRealtime = SystemClock.elapsedRealtime() - j;
        if (!file.setReadable(true, false)) {
            DeviceLog.debug("Unity Ads cache: could not set file readable!");
        }
        if (z) {
            DeviceLog.debug("Unity Ads cache: downloading of " + str + " stopped");
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_STOPPED, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(jElapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
            return;
        }
        DeviceLog.debug("Unity Ads cache: File " + file.getName() + " of " + j2 + " bytes downloaded in " + jElapsedRealtime + "ms");
        cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_END, str, Long.valueOf(j2), Long.valueOf(j3), Long.valueOf(jElapsedRealtime), Integer.valueOf(i), Request.getResponseHeadersMap(map));
    }

    @Override // android.os.Handler
    public void handleMessage(Message message) throws Throwable {
        HashMap<String, List<String>> map;
        Bundle data = message.getData();
        String string = data.getString("source");
        data.remove("source");
        String string2 = data.getString("target");
        data.remove("target");
        int i = data.getInt("connectTimeout");
        data.remove("connectTimeout");
        int i2 = data.getInt("readTimeout");
        data.remove("readTimeout");
        int i3 = data.getInt("progressInterval");
        data.remove("progressInterval");
        boolean z = data.getBoolean("append", false);
        data.remove("append");
        CacheEventSender cacheEventSender = (CacheEventSender) data.getSerializable("cacheEventSender");
        data.remove("cacheEventSender");
        if (data.size() > 0) {
            DeviceLog.debug("There are headers left in data, reading them");
            map = new HashMap<>();
            for (String str : data.keySet()) {
                map.put(str, Arrays.asList(data.getStringArray(str)));
            }
        } else {
            map = null;
        }
        HashMap<String, List<String>> map2 = map;
        File file = new File(string2);
        if ((z && !file.exists()) || (!z && file.exists())) {
            this._active = false;
            cacheEventSender.sendEvent(CacheEvent.DOWNLOAD_ERROR, CacheError.FILE_STATE_WRONG, string, string2, Boolean.valueOf(z), Boolean.valueOf(file.exists()));
        } else {
            if (message.what != 1) {
                return;
            }
            downloadFile(string, string2, i, i2, i3, map2, z, cacheEventSender);
        }
    }

    public boolean isActive() {
        return this._active;
    }

    public void setCancelStatus(boolean z) {
        WebRequest webRequest;
        this._canceled = z;
        if (!z || (webRequest = this._currentRequest) == null) {
            return;
        }
        this._active = false;
        webRequest.cancel();
    }
}
