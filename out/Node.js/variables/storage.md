{% extends "_shared/templates/_silver_docs_api_page_node_veneer.html" %}

{% block pagevariables %}
  {% setvar api_name %}Google Cloud Storage API{% endsetvar %}
  {% setvar product_name %}Google Cloud Storage{% endsetvar %}
  {% setvar getting_started_url %}https://cloud.google.com/storage/docs/signup{% endsetvar %}
  {% setvar client_lib_url %}https://googlecloudplatform.github.io/gcloud-node/#/docs/{% endsetvar %}
  {% setvar explorer_url %}https://developers.google.com/apis-explorer/#p/storage/v1/{% endsetvar %}
  
  {% setvar api_reference_url %}https://googlecloudplatform.github.io/gcloud-node/#/docs/v0.30.2/storage{% endsetvar %}
  {% setvar client_lib_github_url %}https://github.com/GoogleCloudPlatform/gcloud-node{% endsetvar %} 
  {% setvar http_ref_url %}https://cloud.google.com/storage/docs/json_api/{% endsetvar %}
{% endblock %}


{% block page_description %}
Google Cloud Storage allows world-wide storage and retrieval of any amount of data at any time. To learn more about Google Cloud Storage, see <a href="https://cloud.google.com/storage/docs/overview">What is Google Cloud Storage?</a>
{% endblock %}