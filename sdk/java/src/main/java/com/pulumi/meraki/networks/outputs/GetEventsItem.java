// *** WARNING: this file was generated by pulumi-java-gen. ***
// *** Do not edit by hand unless you're certain you know what you are doing! ***

package com.pulumi.meraki.networks.outputs;

import com.pulumi.core.annotations.CustomType;
import com.pulumi.exceptions.MissingRequiredPropertyException;
import com.pulumi.meraki.networks.outputs.GetEventsItemEvent;
import java.lang.String;
import java.util.List;
import java.util.Objects;

@CustomType
public final class GetEventsItem {
    /**
     * @return An array of events that took place in the network.
     * 
     */
    private List<GetEventsItemEvent> events;
    /**
     * @return A message regarding the events sent. Usually &#39;null&#39; unless there are no events
     * 
     */
    private String message;
    /**
     * @return An UTC ISO8601 string of the latest occured at time of the listed events of the page.
     * 
     */
    private String pageEndAt;
    /**
     * @return An UTC ISO8601 string of the earliest occured at time of the listed events of the page.
     * 
     */
    private String pageStartAt;

    private GetEventsItem() {}
    /**
     * @return An array of events that took place in the network.
     * 
     */
    public List<GetEventsItemEvent> events() {
        return this.events;
    }
    /**
     * @return A message regarding the events sent. Usually &#39;null&#39; unless there are no events
     * 
     */
    public String message() {
        return this.message;
    }
    /**
     * @return An UTC ISO8601 string of the latest occured at time of the listed events of the page.
     * 
     */
    public String pageEndAt() {
        return this.pageEndAt;
    }
    /**
     * @return An UTC ISO8601 string of the earliest occured at time of the listed events of the page.
     * 
     */
    public String pageStartAt() {
        return this.pageStartAt;
    }

    public static Builder builder() {
        return new Builder();
    }

    public static Builder builder(GetEventsItem defaults) {
        return new Builder(defaults);
    }
    @CustomType.Builder
    public static final class Builder {
        private List<GetEventsItemEvent> events;
        private String message;
        private String pageEndAt;
        private String pageStartAt;
        public Builder() {}
        public Builder(GetEventsItem defaults) {
    	      Objects.requireNonNull(defaults);
    	      this.events = defaults.events;
    	      this.message = defaults.message;
    	      this.pageEndAt = defaults.pageEndAt;
    	      this.pageStartAt = defaults.pageStartAt;
        }

        @CustomType.Setter
        public Builder events(List<GetEventsItemEvent> events) {
            if (events == null) {
              throw new MissingRequiredPropertyException("GetEventsItem", "events");
            }
            this.events = events;
            return this;
        }
        public Builder events(GetEventsItemEvent... events) {
            return events(List.of(events));
        }
        @CustomType.Setter
        public Builder message(String message) {
            if (message == null) {
              throw new MissingRequiredPropertyException("GetEventsItem", "message");
            }
            this.message = message;
            return this;
        }
        @CustomType.Setter
        public Builder pageEndAt(String pageEndAt) {
            if (pageEndAt == null) {
              throw new MissingRequiredPropertyException("GetEventsItem", "pageEndAt");
            }
            this.pageEndAt = pageEndAt;
            return this;
        }
        @CustomType.Setter
        public Builder pageStartAt(String pageStartAt) {
            if (pageStartAt == null) {
              throw new MissingRequiredPropertyException("GetEventsItem", "pageStartAt");
            }
            this.pageStartAt = pageStartAt;
            return this;
        }
        public GetEventsItem build() {
            final var _resultValue = new GetEventsItem();
            _resultValue.events = events;
            _resultValue.message = message;
            _resultValue.pageEndAt = pageEndAt;
            _resultValue.pageStartAt = pageStartAt;
            return _resultValue;
        }
    }
}
