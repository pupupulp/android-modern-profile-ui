package com.fujiyama.pulp.modernprofileui;

import android.text.Spannable;
import android.text.TextPaint;
import android.text.style.URLSpan;

public class URLSpanNoUnderline extends URLSpan {

    public URLSpanNoUnderline(String url) {
        super(url);
    }

    public void updateDrawState(TextPaint drawState) {
        super.updateDrawState(drawState);
        drawState.setUnderlineText(false);
    }

    public static void removeUnderlines(Spannable text) {
        URLSpan[] spans = text.getSpans(0, text.length(), URLSpan.class);

        for(URLSpan span:spans) {
            int start = text.getSpanStart(span);
            int end = text.getSpanEnd(span);
            text.removeSpan(span);
            span = new URLSpanNoUnderline(span.getURL());
            text.setSpan(span, start, end, 0);
        }
    }
}
