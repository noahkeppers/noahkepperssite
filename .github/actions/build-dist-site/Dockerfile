FROM ruby:2-slim
LABEL author="Sujay Kundu"
LABEL version="1.0.0"

ENV BUNDLER_VERSION 2.1.4
RUN apt-get update && \
    apt-get install --no-install-recommends -y \
    bats \
    build-essential \
    ca-certificates \
    curl \
    libffi6 \
    make \
    shellcheck \
    libffi6 \
    git-all \
    && gem install bundler:2.1.4 \
    && bundle config --global silence_root_warning 1

COPY entrypoint.sh /

ENTRYPOINT ["sh", "/entrypoint.sh"]
