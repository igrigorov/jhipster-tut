package gr.cognity.domain;

import java.io.Serializable;
import java.time.Instant;
import javax.persistence.*;
import org.hibernate.annotations.Cache;
import org.hibernate.annotations.CacheConcurrencyStrategy;

/**
 * A WsRequestsStateJSON.
 */
@Entity
@Table(name = "ws_requests_state_json")
@Cache(usage = CacheConcurrencyStrategy.READ_WRITE)
@SuppressWarnings("common-java:DuplicatedBlocks")
public class WsRequestsStateJSON implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "sequenceGenerator")
    @SequenceGenerator(name = "sequenceGenerator")
    @Column(name = "id")
    private Long id;

    @Column(name = "request_id")
    private Long requestId;

    @Column(name = "request_idx")
    private Integer requestIdx;

    @Lob
    @Column(name = "cmd_list_json")
    private String cmdListJson;

    @Column(name = "src_system")
    private String srcSystem;

    @Column(name = "created")
    private Instant created;

    // jhipster-needle-entity-add-field - JHipster will add fields here

    public Long getId() {
        return this.id;
    }

    public WsRequestsStateJSON id(Long id) {
        this.setId(id);
        return this;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getRequestId() {
        return this.requestId;
    }

    public WsRequestsStateJSON requestId(Long requestId) {
        this.setRequestId(requestId);
        return this;
    }

    public void setRequestId(Long requestId) {
        this.requestId = requestId;
    }

    public Integer getRequestIdx() {
        return this.requestIdx;
    }

    public WsRequestsStateJSON requestIdx(Integer requestIdx) {
        this.setRequestIdx(requestIdx);
        return this;
    }

    public void setRequestIdx(Integer requestIdx) {
        this.requestIdx = requestIdx;
    }

    public String getCmdListJson() {
        return this.cmdListJson;
    }

    public WsRequestsStateJSON cmdListJson(String cmdListJson) {
        this.setCmdListJson(cmdListJson);
        return this;
    }

    public void setCmdListJson(String cmdListJson) {
        this.cmdListJson = cmdListJson;
    }

    public String getSrcSystem() {
        return this.srcSystem;
    }

    public WsRequestsStateJSON srcSystem(String srcSystem) {
        this.setSrcSystem(srcSystem);
        return this;
    }

    public void setSrcSystem(String srcSystem) {
        this.srcSystem = srcSystem;
    }

    public Instant getCreated() {
        return this.created;
    }

    public WsRequestsStateJSON created(Instant created) {
        this.setCreated(created);
        return this;
    }

    public void setCreated(Instant created) {
        this.created = created;
    }

    // jhipster-needle-entity-add-getters-setters - JHipster will add getters and setters here

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof WsRequestsStateJSON)) {
            return false;
        }
        return id != null && id.equals(((WsRequestsStateJSON) o).id);
    }

    @Override
    public int hashCode() {
        // see https://vladmihalcea.com/how-to-implement-equals-and-hashcode-using-the-jpa-entity-identifier/
        return getClass().hashCode();
    }

    // prettier-ignore
    @Override
    public String toString() {
        return "WsRequestsStateJSON{" +
            "id=" + getId() +
            ", requestId=" + getRequestId() +
            ", requestIdx=" + getRequestIdx() +
            ", cmdListJson='" + getCmdListJson() + "'" +
            ", srcSystem='" + getSrcSystem() + "'" +
            ", created='" + getCreated() + "'" +
            "}";
    }
}
